# icinbank
Online-Bank-Simulator

Spring Boot/Spring Data/Spring Security/Hibernate/MySQL/REST

The project simulates online banking system. It allows to register/login, deposit/withdraw money from accounts, add/edit recipients, transfer money between accounts and recipients, view transactions, make cheque book request.

There are two roles user and admin (devadeepdeb as user, gkdeb as admin).

<h3>Deployment Steps on Docker via Jenkins</h3>
I have used my personal laptop Jenkins and Docker application to run it.
Deployment steps are available in <a href="https://github.com/devadeepdeb/icinbank/blob/master/Jenkinsfile">Jenkinsfile</a>
Also used automated selenium and junit5 tests in <a href="https://github.com/devadeepdeb/icinbank/blob/master/Jenkinsfile">Jenkinsfile</a> to create both admin and user mentioned above in chrome browser only.
