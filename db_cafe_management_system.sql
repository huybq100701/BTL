create database cafe_management_system;
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
('admin', 'admin', 'Admin', 1000);

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
  values(1000, 'ADMIN', 'Male', '2021/10/10', 'Ha Noi', '0123456789', 'Manager', '15000000');

CREATE TABLE `drinks` (
  `ID` int(11) NOT NULL,
  `DrinksName` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `drinks` (ID, DrinksName, cost) VALUES
(4, 'Cà phê', 40000),
(5, 'Bạc xỉu', 30000),
(6, 'Cà phê đen', 20000),
(7, 'Cà phê đá', 40000);
select * from drinks;

CREATE TABLE `tables` (
  `ID` int(11) NOT NULL,
  `table_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `note` text COLLATE utf8_unicode_ci,
  `status` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `tables` (`ID`, `table_name`, `note`, `status`) VALUES
(1, 'Bàn 1', '', 0),
(2, 'Bàn 2', '', 0),
(3, 'Bàn 3', '', 0),
(4, 'Bàn 4', '', 0),
(5, 'Bàn 5', '5 người', 0);