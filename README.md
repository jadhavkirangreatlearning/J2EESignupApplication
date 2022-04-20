# J2EESignupApplication

Signup- Java:Servlet | JSP | MySQL

Database Structure-
Database- EmployeeDBMgnt
Table- Employee
empid empname empaddress empsalary empemailid empcontactnumber

Back End
MVC
M- Model
V- View
C- Controller

Front End[UI]
index.jsp
showData.jsp



DB-

CREATE DATABASE EmployeeDBMgnt

USE EmployeeDBMgnt

CREATE TABLE employee(empid INT, empname VARCHAR(255), empaddress VARCHAR(255),
empsalary DOUBLE, empemailid VARCHAR(255), empcontactnumber BIGINT,
PRIMARY KEY(empid), UNIQUE KEY(empemailid), UNIQUE KEY(empcontactnumber))

SELECT * FROM employee