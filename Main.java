

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/cool";
    private static final String USER = "root";
    private static final String PASS = "wicked";

    public static void main(String[] args) {
     
        String insertSql = "INSERT INTO emp_detail (name, salary,followers) VALUES (?, ?)";
        String selectSql = "SELECT id, name, salary,followers FROM emp_detail";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Executing INSERT operation ---");
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            

            insertStmt.setString(1, "John");
            insertStmt.setDouble(2, 50000.0);
            int rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected + " rows(s) inserted successfully.");

           
            insertStmt.setString(1, "Jane Smith");
            insertStmt.setDouble(2, 60000.0);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected + " rows(s) inserted successfully.");

             insertStmt.setString(1, "will");
            insertStmt.setDouble(2, 700000.0);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected + " rows(s) inserted successfully.");

             insertStmt.setString(1, "sydney");
            insertStmt.setDouble(2, 100000.0);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected + " rows(s) inserted successfully.");

             insertStmt.setString(1, "ariana");
            insertStmt.setDouble(2, 10000000.0);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected + " rows(s) inserted successfully.");

            System.out.println("\n--- Executing SELECT operation ---");
            
            PreparedStatement selectStmt = conn.prepareStatement(selectSql);
            ResultSet rs = selectStmt.executeQuery();

            System.out.println("Employee Data:");
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.printf("ID: %d, Name: %s, Salary: %f\n", id, name, salary);
            }
        
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}