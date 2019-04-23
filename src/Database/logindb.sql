CREATE DATABASE logindb;
USE logindb;

CREATE TABLE Admin (
    id INT UNSIGNED NOT NULL PRIMARY KEY,
    password VARCHAR(32) DEFAULT NULL,
    date_joined TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE VehicleDepartmentRep (
    id INT UNSIGNED NOT NULL PRIMARY KEY,
    password VARCHAR(32) DEFAULT NULL,
    date_joined TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE CustomerServiceRep (
    id INT UNSIGNED NOT NULL PRIMARY KEY,
    password VARCHAR(32) DEFAULT NULL,
    date_joined TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

create table customer(
    customer_id int not null auto_increment,
    customer_name varchar(150),
    customer_street varchar(150),
    customer_city varchar(150),
    primary key (customer_id)
);

INSERT INTO Admin (id, password) 
    VALUES ("1000", MD5("password123"));

INSERT INTO VehicleDepartmentRep (id, password) 
    VALUES ("1005", MD5("password123"));

INSERT INTO CustomerServiceRep (id, password) 
    VALUES ("1010", MD5("password123"));

