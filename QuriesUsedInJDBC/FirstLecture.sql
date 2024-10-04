show databases

create database DataBaseUseForJDBC
use DataBaseUseForJDBC

CREATE TABLE Students (
    RollNumber INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Age INT,
    Gender VARCHAR(10),
    YearOfStudy INT,
    Department VARCHAR(100),
    CGPA DECIMAL(3, 2),
    Email VARCHAR(100),
    PhoneNumber VARCHAR(15),
    Address VARCHAR(255),
    City VARCHAR(100),
    State VARCHAR(100),
    PostalCode VARCHAR(10),
    DateOfBirth DATE,
    AdmissionYear INT,
    Scholarship BOOLEAN,
    HostelResident BOOLEAN,
    ParentName VARCHAR(100),
    ParentPhoneNumber VARCHAR(15)
);

INSERT INTO Students (RollNumber, FirstName, LastName, Age, Gender, YearOfStudy, Department, CGPA, Email, PhoneNumber, Address, City, State, PostalCode, DateOfBirth, AdmissionYear, Scholarship, HostelResident, ParentName, ParentPhoneNumber)
VALUES
(1, 'Raj', 'Sharma', 20, 'Male', 3, 'Computer Science', 8.5, 'raj.sharma@email.com', '9876543210', '123 Street Name', 'Mumbai', 'Maharashtra', '400001', '2004-05-15', 2021, TRUE, FALSE, 'Vijay Sharma', '9876541111'),
(2, 'Priya', 'Kumar', 21, 'Female', 4, 'Mechanical Engineering', 8.7, 'priya.kumar@email.com', '9876509876', '456 Lane Name', 'Pune', 'Maharashtra', '411001', '2003-04-20', 2020, FALSE, TRUE, 'Suresh Kumar', '9876502222'),
(3, 'Amit', 'Patel', 19, 'Male', 2, 'Electrical Engineering', 7.8, 'amit.patel@email.com', '9876512345', '789 Road Name', 'Ahmedabad', 'Gujarat', '380001', '2005-03-10', 2022, TRUE, TRUE, 'Rakesh Patel', '9876513333'),
(4, 'Sunita', 'Verma', 22, 'Female', 4, 'Civil Engineering', 8.6, 'sunita.verma@email.com', '9876523456', '101 Colony', 'Bangalore', 'Karnataka', '560001', '2002-07-30', 2020, TRUE, FALSE, 'Mahesh Verma', '9876524444'),
(5, 'Anil', 'Reddy', 23, 'Male', 4, 'Chemical Engineering', 8.3, 'anil.reddy@email.com', '9876534567', '202 Village', 'Hyderabad', 'Telangana', '500001', '2001-12-12', 2019, FALSE, TRUE, 'Kiran Reddy', '9876535555'),
(6, 'Neha', 'Ghosh', 20, 'Female', 3, 'Information Technology', 8.9, 'neha.ghosh@email.com', '9876545678', '303 Locality', 'Kolkata', 'West Bengal', '700001', '2004-09-25', 2021, TRUE, FALSE, 'Ravi Ghosh', '9876546666'),
(7, 'Manish', 'Nair', 19, 'Male', 2, 'Electronics Engineering', 7.5, 'manish.nair@email.com', '9876556789', '404 Area', 'Chennai', 'Tamil Nadu', '600001', '2005-11-18', 2022, FALSE, TRUE, 'Krishna Nair', '9876557777'),
(8, 'Rohit', 'Singh', 18, 'Male', 1, 'Biotechnology', 8.0, 'rohit.singh@email.com', '9876567890', '505 Block', 'Lucknow', 'Uttar Pradesh', '226001', '2006-06-30', 2023, TRUE, FALSE, 'Ajay Singh', '9876568888'),
(9, 'Sakshi', 'Chauhan', 22, 'Female', 4, 'Architecture', 9.0, 'sakshi.chauhan@email.com', '9876578901', '606 Complex', 'Jaipur', 'Rajasthan', '302001', '2002-01-05', 2020, FALSE, TRUE, 'Ashok Chauhan', '9876579999'),
(10, 'Karan', 'Jain', 21, 'Male', 3, 'Physics', 8.2, 'karan.jain@email.com', '9876589012', '707 House', 'Indore', 'Madhya Pradesh', '452001', '2003-02-12', 2021, TRUE, FALSE, 'Pankaj Jain', '9876580000'),
(11, 'Arjun', 'Desai', 18, 'Male', 1, 'Mathematics', 7.6, 'arjun.desai@email.com', '9876590123', '808 Street', 'Surat', 'Gujarat', '395001', '2006-10-15', 2023, FALSE, TRUE, 'Rajesh Desai', '9876591111'),
(12, 'Megha', 'Iyer', 19, 'Female', 2, 'Chemistry', 8.7, 'megha.iyer@email.com', '9876601234', '909 Avenue', 'Coimbatore', 'Tamil Nadu', '641001', '2005-08-10', 2022, TRUE, FALSE, 'Naveen Iyer', '9876602222'),
(13, 'Ravi', 'Prasad', 20, 'Male', 3, 'Political Science', 8.4, 'ravi.prasad@email.com', '9876612345', '1011 Street', 'Patna', 'Bihar', '800001', '2004-07-05', 2021, FALSE, TRUE, 'Anil Prasad', '9876613333'),
(14, 'Swati', 'Gupta', 23, 'Female', 4, 'History', 8.1, 'swati.gupta@email.com', '9876623456', '1212 Nagar', 'Delhi', 'Delhi', '110001', '2001-09-20', 2019, TRUE, FALSE, 'Raj Gupta', '9876624444'),
(15, 'Vivek', 'Mehta', 22, 'Male', 4, 'Economics', 8.5, 'vivek.mehta@email.com', '9876634567', '1313 Apartment', 'Bhopal', 'Madhya Pradesh', '462001', '2002-03-15', 2020, FALSE, TRUE, 'Kailash Mehta', '9876635555'),
(16, 'Pooja', 'Rao', 21, 'Female', 3, 'Sociology', 8.6, 'pooja.rao@email.com', '9876645678', '1414 Villa', 'Mysore', 'Karnataka', '570001', '2003-12-22', 2021, TRUE, FALSE, 'Srinivas Rao', '9876646666'),
(17, 'Rahul', 'Pillai', 19, 'Male', 2, 'English Literature', 7.9, 'rahul.pillai@email.com', '9876656789', '1515 Township', 'Thiruvananthapuram', 'Kerala', '695001', '2005-04-18', 2022, FALSE, TRUE, 'Mohan Pillai', '9876657777'),
(18, 'Asha', 'Kapoor', 20, 'Female', 3, 'Psychology', 8.8, 'asha.kapoor@email.com', '9876667890', '1616 Bunglow', 'Chandigarh', 'Punjab', '160001', '2004-06-12', 2021, TRUE, FALSE, 'Vikram Kapoor', '9876668888'),
(19, 'Nikhil', 'Mishra', 18, 'Male', 1, 'Law', 7.4, 'nikhil.mishra@email.com', '9876678901', '1717 Complex', 'Varanasi', 'Uttar Pradesh', '221001', '2006-02-25', 2023, FALSE, TRUE, 'Sanjay Mishra', '9876679999'),
(20, 'Geeta', 'Malhotra', 22, 'Female', 4, 'Journalism', 8.9, 'geeta.malhotra@email.com', '9876689012', '1818 Sector', 'Amritsar', 'Punjab', '143001', '2002-11-08', 2020, TRUE, FALSE, 'Rohit Malhotra', '9876680000');

select * from Students

