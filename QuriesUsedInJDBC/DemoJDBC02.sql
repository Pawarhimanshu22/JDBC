show databases

create database JDBCDB
use JDBCDB
CREATE TABLE Students (
    RollNumber INT PRIMARY KEY,
    Name VARCHAR(60) NOT NULL,
    City VARCHAR(80)
);

INSERT INTO Students VALUES (01, 'Himanshu Pawar', 'Indore');
INSERT INTO Students VALUES (02, 'Himanshi Sharma', 'Bhopal');
INSERT INTO Students VALUES (03, 'Mahi Yadav', 'Amla');
INSERT INTO Students VALUES (04, 'Nikku', 'Delhi');
INSERT INTO Students VALUES (05, 'Raja', 'Haryana');
INSERT INTO Students VALUES(07, 'Kangana', 'Mandi');
INSERT INTO Students VALUES(08, 'Raju', 'agara');

delete from Students where RollNumber=07;

select * from Students