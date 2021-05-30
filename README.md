# icinbank
Online-Bank-Simulator

Spring Boot/Spring Data/Spring Security/Hibernate/MySQL/REST

The project simulates online banking system. It allows to register/login, deposit/withdraw money from accounts, add/edit recipients, transfer money between accounts and recipients, view transactions, make cheque book request.

There are two roles user and admin (devadeepdeb as user, gkdeb as admin).

<h3>Deployment Steps on Docker via Jenkins</h3>
<p>I have used my personal laptop Jenkins and Docker application to run it.</p>
<p>Deployment steps are available in <a href="https://github.com/devadeepdeb/icinbank/blob/master/Jenkinsfile">Jenkinsfile</a></p>
<p>Also used automated selenium and junit5 tests in <a href="https://github.com/devadeepdeb/icinbank/blob/master/Jenkinsfile">Jenkinsfile</a> to create both admin and user mentioned above in chrome browser only.</p>
<p>Issued command "java -jar jenkins.war" where jenkins.war is installed to launch jenkins</p>
<p>It opened on port 8080. Installed docker plugins from Maven and created a multipipeline project named "BankPipeline"</p>
<p>Configured it as below.</p>
<img src="Images/BankPipeline Configuration.PNG">
<img src="Images/BankPipeline Configuration-cont.PNG">
<p>Click on create branch which generated master branch for  "BankPipeline". Go to that branch and click "Build Now".</p>
<p>Multi staged pipeline completed like this with logs.</p>
<img src="Images/Multipipeline execution.PNG">
<img src="Images/mv1.PNG">
<img src="Images/mv2.PNG">
<img src="Images/mv3.PNG">
<img src="Images/mv4.PNG">
<img src="Images/mv5.PNG">
<img src="Images/mv6.PNG">
<img src="Images/mv7.PNG">
<img src="Images/mv8.PNG">
<img src="Images/mv9.PNG">
<img src="Images/mv10.PNG">
<img src="Images/mv11.PNG">
<img src="Images/mv12.PNG">
<img src="Images/mv13.PNG">
<img src="Images/mv14.PNG">
<img src="Images/mv15.PNG">
<p>After that Spring boot application start on port 7070 as per below screenshots</p>
<img src="Images/Boot1.PNG">
<img src="Images/Boot2.PNG">
<img src="Images/Boot3.PNG">
<img src="Images/Boot4.PNG">
<img src="Images/Boot5.PNG">
<img src="Images/Boot6.PNG">
<img src="Images/Boot7.PNG">
<img src="Images/Boot8.PNG">
<img src="Images/Boot9.PNG">
<img src="Images/Boot10.PNG">
<img src="Images/Boot11.PNG">
<img src="Images/Boot12.PNG">
<img src="Images/Boot13.PNG">
<img src="Images/Boot14.PNG">
<img src="Images/Boot15.PNG">
<img src="Images/Boot16.PNG">
<img src="Images/Boot17.PNG">
<img src="Images/Boot18.PNG">
<img src="Images/Boot19.PNG">
<img src="Images/Boot20.PNG">
<p>Below is the way how the admin can be updated manually via mysql:8.0.23 docker running container</p>
<img src="Images/AdminRole update in db.PNG">
