CREATE DATABASE EMPLOYEE;

 USE EMPLOYEE;

CREATE TABLE employee 
(
emp_id int ,
emp_name varchar(50),
dept varchar(50),
salary int,
PRIMARY KEY(emp_id)
);

SELECT * FROM employee;

ALTER TABLE employee
MODIFY emp_id int NOT NULL;

INSERT  INTO employee (emp_id, emp_name, dept, salary)
VALUES 
 (1, 'emp1', 'manager', 30000),
 (2, 'emp2', 'ACCOUTANT', 22000),
 (3, 'emp3', 'HR', 10000),
 (4, 'emp4', 'SOFTWARE DEVLOPER', 50000);
 
 SELECT emp_name ,salary FROM employee;
 
 UPDATE employee
SET dept = 'FINANCE'
WHERE emp_id = 2;

DELETE FROM employee WHERE emp_id=1;

SELECT * FROM employee;
