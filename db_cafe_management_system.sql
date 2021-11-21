create database cafe_management_system
CREATE TABLE `account` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `employee_id` int NOT NULL,
  FOREIGN KEY (`employee_id`) REFERENCES `employee`(`id`),
  PRIMARY KEY (`id`));

insert into account (username, password, name, employee_id)
values 
('admin', 'admin', 'Admin', 1000)

CREATE TABLE `employee` (
  `id` int NOT NULL,
  `name` VARCHAR(45) NULL,
  `gender` varchar(10) NULL,
  `join_date` date NULL,
  `address` VARCHAR(45) NULL,
  `phone_number` VARCHAR(45) NULL,
  `position` varchar(45) NULL,
  `salary` int NULL,
  PRIMARY KEY (`id`));
  insert into employee(id, name, gender, join_date, address, phone_number, position, salary)
  values(1000, 'ADMIN', 'Male', '2021/10/10', 'Ha Noi', '0123456789', 'Manager', '15000000')
