# icinbank
Online-Bank-Simulator

Spring Boot/Spring Data/Spring Security/Hibernate/MySQL/REST

The project simulates online banking system. It allows to register/login, deposit/withdraw money from accounts, add/edit recipients, transfer money between accounts and recipients, view transactions, make cheque book request.

There are two roles user and admin (devadeepdeb as user, gkdeb as admin).

<h3>Deployment Steps on Docker via Jenkins</h3>
<p>I have used my personal laptop Jenkins and Docker application to run it.</p>
<p>Deployment steps are available in <a href="https://github.com/devadeepdeb/icinbank/blob/master/Jenkinsfile">Jenkinsfile</a></p>
<p>Also used automated selenium and junit5 tests in <a href="https://github.com/devadeepdeb/icinbank/blob/master/Jenkinsfile">Jenkinsfile</a> to create both admin and user mentioned above in chrome browser only.</p>
Issued command "java -jar jenkins.war" where jenkins.war is installed to launch jenkins
It opened on port 8080. Installed docker plugins from Maven and created a multipipeline project named "BankPipeline"
Configured it as below.


Click on create branch which generated master branch for  "BankPipeline". Go to that branch and click "Build Now".
Multi staged pipeline completed like this.


