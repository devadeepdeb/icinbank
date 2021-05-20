pipeline {
    agent any
    parameters {
        string(name: 'MYSQL_ROOT_PASSWORD', defaultValue: 'devadeep', description: 'MySQL password')
        string(name: 'MYSQL_DATABASE', defaultValue: 'bootdb', description: 'MySQL database')
        string(name: 'MYSQL_USER', defaultValue: 'root', description: 'MySQL username')
    }
    stages {
        stage ("Initialize Jenkins Env") {
         steps {
            bat '''
            echo "PATH = ${PATH}"
            echo "M2_HOME = ${M2_HOME}"
            '''
         }
        }
        stage('Download Code') {
            steps {
               echo 'checking out'
               checkout scm
            }
        }
        stage('Execute Tests'){
            steps {
                echo 'Testing Skipped'
                bat 'mvn test -Dmaven.test.skip=true'
            }
        }
        stage('Build Application'){
            steps {
                echo 'Building...'
                bat 'mvn clean install -Dmaven.test.skip=true'
            }
        }
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image'
                bat 'docker build -t devadeepdebicinbank .'
            }
        }
        stage('Pull MySQL Image') {
            steps {
                echo 'Pulling mysql image'
                bat 'docker pull mysql:8.0.23'
            }
        }
        stage('Run MySQL server to run as Docker container') {
            steps {
                echo 'Running mysql image'
                bat 'docker run --name mysqldbnewone --env="MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD}" --env="MYSQL_DATABASE=${MYSQL_DATABASE}" --env="MYSQL_USER=${MYSQL_USER}" --detach mysql:8.0.23'
//                bat 'docker exec -i mysqldbnewone mysql -u${MYSQL_USER} -p${MYSQL_ROOT_PASSWORD}'
//                bat 'timeout 20'
            }
        }
        stage('Deploy and Run Bank Application container') {
            steps {
                echo 'Starting application container'
                bat 'docker run --detach -p 8089:8080 --name devadeepdebicinbank --link mysqldbnewone:mysql devadeepdebicinbank'
            }
        }
//       stage('Create Database') {
//            steps {
//                echo 'Running Database Image'
//            //    sh 'docker kill bankmysql 2> /dev/null'
//            //    sh 'docker kill cloudbank 2> /dev/null'
//            //    sh 'docker rm bankmysql 2> /dev/null'
//            //    sh 'docker rm cloudbank 2> /dev/null'
//                sh 'docker stop bootdb || true && docker rm bootdb || true'
//                sh 'docker run --detach --name=mysqldbnew --env="MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD}" -p 3306:3306 mysql:8.0.23'
//                sh 'sleep 20'
//            //  sh 'docker exec -i bankmysql mysql -uroot -proot < sql_dump/onlinebanking.sql'
//                sh 'docker exec -i mysqldbnew mysql -uroot -p${MYSQL_ROOT_PASSWORD} < sql_dump/bootdb.sql'
//            }
//        }
//        stage('Deploy and Run') {
//            steps {
//                echo 'Running Application'
//                sh 'docker stop cloudbank || true && docker rm cloudbank || true'
//                sh 'docker run --detach --name=cloudbank -p 8888:8888 --link mysqlsqldbnew:localhost -t devadeepdeb/icinbank:1'
//            }
//        }
    }
}