************************************************************************************
********* Project created con Spring Tools Suite 4 and MySQL 8.0 Workbench *********
************************************************************************************

1) Create the DATABASE and adding some rows:

CREATE DATABASE your_dbname;
USE springboot_jpa_crud;
CREATE TABLE USER
(
 id INT NOT NULL AUTO_INCREMENT,
 name VARCHAR(255) NULL,
 surname VARCHAR(255) NULL,
 email VARCHAR(255) NULL,
 birthdate VARCHAR(45) NULL,
 PRIMARY KEY(id)
);

INSERT INTO your_dbname VALUES(1, 'John', 'Q', 'johnq@gmail.com', '1975-01-12');
INSERT INTO your_dbname VALUES(1, 'John', 'Q', 'johnq@gmail.com', '1997-12-01');
INSERT INTO your_dbname VALUES(1, 'John', 'Q', 'johnq@gmail.com', '1956-06-05');
INSERT INTO your_dbname VALUES(1, 'John', 'Q', 'johnq@gmail.com', '2001-08-07');
INSERT INTO your_dbname VALUES(1, 'John', 'Q', 'johnq@gmail.com', '1999-09-12');
****************************************************************************************************************************************************************

2) Download the project from repository url provided. Unzip in your prefered destination folder.

****************************************************************************************************************************************************************

3) File -> Import -> Select the project from the folder where previously you unzip. Finish once the pom.xml file is found.

****************************************************************************************************************************************************************

4) File application.properties: write your data where required:

spring.datasource.url=jdbc:mysql://localhost:3306/your_dbname?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=your_username in MySQL
spring.datasource.password=your_password in MYSQL

Note: MySQL listen on 3306 port by default.

****************************************************************************************************************************************************************

5) Launch as Springboot application: make sure that 8080 port is not listening other execution because the embebed Tomcat in the Springboot application listens on 8080 port.

****************************************************************************************************************************************************************

6)When application started type in your navigator: localhost:8080/list
So you will be able to interact with the app.

****************************************************************************************************************************************************************
