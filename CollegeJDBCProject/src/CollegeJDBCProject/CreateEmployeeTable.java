package CollegeJDBCProject;

import java.sql.*;

import java.sql.DriverManager;

public class CreateEmployeeTable {
	
	public static final String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static final String URL = "jdbc:mysql://localhost:3306/collegecompany";
	
	public static final String USER_NAME = "root";
	
	public static final String PASSWORD = "@#IFeelLikeKing22";
	
	public static void main(String[] args)
	{
		
		try
		{
			Class.forName(LOAD_DRIVER);
			
	        // SQL query to create the students table
			
	        String createTableSQL = "CREATE TABLE Employee ("
	                + "id INT PRIMARY KEY, "
	                + "name VARCHAR(100), "
	                + "salary INT"
	                + ")";

	        // Establishing connection and creating the table
	        
	        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	        
	             Statement statement = connection.createStatement() ;

	            // Execute the SQL statement to create the table
	            		 
	             statement.execute(createTableSQL);
	             
	            System.out.println("Table 'employee' has been created successfully!");
	            
	            statement.close();
	            connection.close();


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
