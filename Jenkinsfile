pipeline {
    agent any
    parameters {
        string(name: 'MYSQL_ROOT_PASSWORD', defaultValue: 'devadeep', description: 'MySQL password')
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
        stage('Delete previous Docker Image') {
            steps {
                echo 'Deleting old Docker image'
                bat 'docker rmi devadeepdeb/icinbank:1 .'
            }
        }
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image'
                bat 'docker build -t devadeepdeb/icinbank:1 .'
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