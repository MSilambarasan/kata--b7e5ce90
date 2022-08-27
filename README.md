# kata--b7e5ce90

Step 1: Clone the project by using the below comment
	      git clone https://github.com/MSilambarasan/kata--b7e5ce90.git

Step 2: Open eclipse and import the sources (Existing maven project)

Step 3: Once the source is imported, From eclipse right click the project -> Run As -> maven clean

Step 4: Right click the project -> Run As -> maven install (Junit test will be execute)

Step 5: Right click the project -> Maven -> Update Project

Step 6: Open logback.xml file and update the log file path
	<property name="LOG_ROOT" value="Your path" />	

Step 7: Open TowerApplication.java file -> Right click -> Run AS -> Java Application

Step 8: The application will start on port 8081

Step 9: http://localhost:8081/api/v1/tower/3
