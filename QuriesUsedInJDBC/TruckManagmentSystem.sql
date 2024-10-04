create database TruckManagmentSystem
use truckmanagmentsystem

CREATE TABLE Truck (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    model VARCHAR(4),
    capacity int,
    driver_name varchar (80)
);

select * from truck
