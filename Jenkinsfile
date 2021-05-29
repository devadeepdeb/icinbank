pipeline {
    agent any
//    parameters {
//        string(name: 'MYSQL_ROOT_PASSWORD', defaultValue: 'devadeep', description: 'MySQL password')
//        string(name: 'MYSQL_ROOT_USER', defaultValue: 'root', description: 'MySQL password')
//        string(name: 'MYSQL_DATABASE', defaultValue: 'bootdb', description: 'MySQL database')
////        string(name: 'MYSQL_USER', defaultValue: 'root', description: 'MySQL username')
//    }
    stages {
        
		stage('Execute Test3'){
            steps {
                echo 'Testing Started'
                bat 'mvn test -Dtest=ICINBanktransfertest'
            }
        }
		stage('Execute Test4'){
            steps {
                echo 'Testing Started'
                bat 'mvn test -Dtest=ICINBankrequesttest'
            }
        }
		stage('Issue Admin Acess from user created through test execution'){
            steps {
                echo 'Issuing Admin Access'
                bat 'docker exec -i  mysqlstandalone mysql -uroot -pdevadeep < update.sql'
				bat 'docker exec -i  mysqlstandalone mysql -uroot -pdevadeep -e "SELECT * FROM bootdb.user_role;"'
            }
        }
//		stage('Clean docker containers and images'){
//		steps{
//		     echo 'Stopping application container and database after 5 minutes'
//		     bat "docker stop usermysql && docker rm usermysql && docker stop mysqlstandalone && docker rm mysqlstandalone && docker rmi usermysql && docker rmi mysql:8.0.23"
//			}
//        }
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