# Assignment_APITest
The assignment to test API workflow

This assignment project is to verify below acceptance criteria of the given api end point. Automated tests are written using REST-assured and testng in Java. 

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false


<b>Acceptance Criteria:</b>
- Name = "Carbon credits"
- CanRelist = true
- The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

#How to run tests.

* Pre-requisites to run the project
  - Java 8 or greater
  - Git 
  - Maven 3.8.1 or greater
  - testng
  - REST-assured


* Clone this project to a local environment.
>> git clone https://github.com/KumuduS/Assignment_APITest.git

* Navigate to root of the project and build the project using below command
>> mvn clean install

* Run tests
	- Option 1: With below command
		>> mvn test
		
	- Option 2 : Open the project in an IDE (Preferable: IntellJ Idea)
		- Right-click on the project (Assignment_APITest) and click "Run All Tests"
		- That will execute the acceptance criteria related all tests in this project

NOTES:
* Open the "APITest.java" class in side the project. Location: Assignment_APITest\src\test\java\org\example\APITest.java
    - This test class contains the tests to validate the above acceptance criteria 
    - Tests are written using testng and rest-assured


