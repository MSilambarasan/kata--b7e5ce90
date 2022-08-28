# kata--b7e5ce90

Technologies used
==================

Spring Boot 2.7.3

Maven 3.8.6

Java 1.8.0_202

Junit 4.13.2

Steps to Execute
================

Step 1: Clone the project by using the below comment
	      git clone https://github.com/MSilambarasan/kata--b7e5ce90.git

Step 2: Open eclipse and import the sources (Existing maven project)

Step 3: Once the source is imported, From eclipse right click the project -> Run As -> maven clean

Step 4: Right click the project -> Run As -> maven install (It will downloads all the dependences and will execute the junit test cases)

Step 5: Right click the project -> Maven -> Update Project

Step 6: Open logback.xml file and update the log file path
	<property name="LOG_ROOT" value="Your path" />	

Step 7: Open TowerApplication.java file -> Right click -> Run AS -> Java Application

Step 8: The application will start on port 8081

Step 9: http://localhost:8081/api/v1/tower/3

Note : After executing all the steps, if you face any compilation error, then remove the repository from .m2 folder and re execute all the steps
