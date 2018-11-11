-- MySQL Database 1st Time Startup Script




-- Create Database School
CREATE DATABASE IF NOT EXISTS school;
USE school;


-- Create Category Table
CREATE TABLE IF NOT EXISTS category (
	categoryId INT NOT NULL AUTO_INCREMENT,
    categoryName NVARCHAR(255) NOT NULL,
    categoryDescription NVARCHAR(255),
    PRIMARY KEY(categoryId)
);

INSERT INTO category 
(categoryName) VALUES ('Study');
INSERT INTO category 
(categoryName) VALUES ('Sport');
INSERT INTO category 
(categoryName) VALUES ('Work');




-- Create Todo Table
CREATE TABLE IF NOT EXISTS todo (
	todoId INT NOT NULL AUTO_INCREMENT,
    description NVARCHAR(255) NOT NULL,
    categoryId INT NOT NULL,
    PRIMARY KEY(todoId),
    FOREIGN KEY(categoryId) REFERENCES category(categoryId)
);

INSERT INTO todo 
(description, categoryId) VALUES 
('Learn Web Application Development', 
(SELECT categoryId FROM category WHERE categoryName = 'Study'));
INSERT INTO todo 
(description, categoryId) VALUES 
('Run 10K', 
(SELECT categoryId FROM category WHERE categoryName = 'Sport'));
INSERT INTO todo 
(description, categoryId) VALUES 
('Check Email', 
(SELECT categoryId FROM category WHERE categoryName = 'Work'));
INSERT INTO todo 
(description, categoryId) VALUES 
('Learn Spring MVC', 
(SELECT categoryId FROM category WHERE categoryName = 'Study'));
