SQL and JDBC Operations with Java 💻
This repository contains a simple Java application that demonstrates how to connect to a MySQL database and perform basic SQL operations using JDBC (Java Database Connectivity). The code showcases how to insert new records into a table and select data from it.

Prerequisites
Java Development Kit (JDK): You'll need JDK 8 or a newer version installed.

MySQL Database: The code connects to a MySQL database named cool on localhost at port 3306.

MySQL Connector/J: The JDBC driver for MySQL is required. You can download the JAR file and add it to your project's classpath. Download here.

Database Table: The code interacts with a table named emp_detail. You will need to create this table in your cool database. Here is the SQL command to create it:

SQL

CREATE TABLE emp_detail (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    salary DOUBLE,
    followers INT
);
Code Overview
The Main.java file contains all the necessary logic. It uses a PreparedStatement to prevent SQL injection vulnerabilities and efficiently execute repeated queries.

DB_URL, USER, PASS: These constants define the database connection details. Make sure to update them with your own credentials if needed.

INSERT Operation: The code inserts five new records into the emp_detail table. The set methods (setString, setDouble) bind the values to the placeholders (?) in the SQL statement.

SELECT Operation: After inserting the data, the code executes a SELECT query to retrieve and print all the records from the table. It iterates through the ResultSet to access each row's data.
