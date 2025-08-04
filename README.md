The Main.java file contains all the necessary logic. It uses a PreparedStatement to prevent SQL injection vulnerabilities and efficiently execute repeated queries.

DB_URL, USER, PASS: These constants define the database connection details. Make sure to update them with your own credentials if needed.

INSERT Operation: The code inserts five new records into the emp_detail table. The set methods (setString, setDouble) bind the values to the placeholders (?) in the SQL statement.

SELECT Operation: After inserting the data, the code executes a SELECT query to retrieve and print all the records from the table. It iterates through the ResultSet to access each row's data.

How to Run
Set up your database: Ensure your MySQL server is running and you have a database named cool with the emp_detail table created as described above.

Add the MySQL Connector/J JAR file to your project's build path.

Update credentials: If your MySQL user, password, or database name is different, change the DB_URL, USER, and PASS constants in the code.

Compile and run the Main.java file.

The output will first show the number of rows inserted, followed by a list of all employee data retrieved from the database.
