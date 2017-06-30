# Krossoverwithcucumber
This repository contains Test cases build using cucumber framework
This project is to automate manual test cases. Automated scripts are written in selenium tool with help of java and using cucumber testing framework.
These scripts cover
1.	Login functionality
2.	Search test

Prerequisites
•	Eclipse IDE
•	Junit 4.x 
•	TestNG 6.x
•	Java
•	Web Driver( In this case only chrome is sufficient)
•	Selenium Jars
•	Junit Jars
•	TestNG Jars
•	Cucumber Jars

Drivers
Chromedriver (Download chormedriver exe file and save it in local drive)

Test Steps for Cucumber Test (Login and Search Test)
1.	Create a Java project
2.	Right click on project >> Build path >> Configure Build path >> Libraries >> Add External jars
3.	Add all jars to project (selenium, Junit,TestNG,Cucumber jars)
4.	Create folder for feature file which includes Test cases written in gherkins language (Business requirement format)
5.	Create two different packages one for Step definition which includes implementation of Test case (Test automation script) and one for Step runner which includes driver class to run script.
6.	Write code  and replace input values with valid input values 
Ex. Replace ‘valid email id’ with genuine email address
‘password’ with genuine password
‘Chromedriver_path’ with chromedriver.exe file path
7.	Go to runner class (Located in ‘runnerforlogin’ package)
8.	Right click on code and run as a Junit Test
9.	Repeat step 1 to 8 for search test except runner class for this script is located in ‘runnerforsearch’ pakage
10.	Check Junit logs for Test results 
