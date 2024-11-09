package CollegeJDBCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/collegecompany";
    private static final String USER = "root";
    private static final String PASS = "@#IFeelLikeKing22";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Load JDBC driver (add this line)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            System.out.println("Enter Employee id:");
            int EmployeeID = sc.nextInt();
            
            System.out.println("Enter Employee name:");
            String EmployeeName = sc.nextLine(); // Changed from next() to nextLine()
            sc.nextLine(); // Add this to consume the leftover newline
            
            System.out.println("Enter Employee salary:");
            int EmployeeSalary01 = sc.nextInt();

            // Note: Make sure your table has 'age' column, not 'salary' as in previous example
            String sql = "INSERT INTO Employee (id, name, salary) VALUES (?, ?, ?)";

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            		
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                pstmt.setInt(1, EmployeeID);
                pstmt.setString(2, EmployeeName);
                pstmt.setInt(3, EmployeeSalary);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("A new Employee has been inserted successfully!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } finally {
            sc.close(); // Close the Scanner
        }
    }
}