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

drop table drinks;
CREATE TABLE `drinks` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DrinksName` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cost` int NOT NULL,
   PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `drinks` (DrinksName, cost) VALUES
('Cà phê', 40000),
('Bạc xỉu', 30000),
('Cà phê đen', 20000),
('Cà phê đá', 40000);

drop table tables;
  CREATE TABLE `tables` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `table_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `note` text COLLATE utf8_unicode_ci,
  `status` tinyint(4) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `tables` (`table_name`, `note`, `status`) VALUES
('Bàn 1', '', 0),
('Bàn 2', '', 0),
('Bàn 3', '', 0),
('Bàn 4', '', 0),
('Bàn 5', '5 người', 0);

drop table invoice;
CREATE TABLE `invoice` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `account_ID` int NOT NULL,
  `invoice_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tables_id` int NOT NULL,
  `status` int NOT NULL,
  `total_price` int NOT NULL DEFAULT '0',
   PRIMARY KEY (`ID`),
   CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`account_ID`) REFERENCES `account`(`id`),
   CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`tables_id`) REFERENCES `tables`(`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

drop table orders;
CREATE TABLE `orders` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `drinks_ID` int NOT NULL,
  `count` int NOT NULL,
  `invoice_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`drinks_ID`) REFERENCES `drinks`(`id`),
  FOREIGN KEY (`invoice_ID`) REFERENCES `invoice`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


