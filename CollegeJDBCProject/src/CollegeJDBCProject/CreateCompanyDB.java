package CollegeJDBCProject;
import java.sql.*;

public class CreateCompanyDB {
	
    public static String Load_Driver  = "com.mysql.cj.jdbc.Driver";

    public static String URL = "jdbc:mysql://localhost:3306/";

    public static String PASSWORD = "@#IFeelLikeKing22";

    public static String USER_NAME = "root";
	
	public static void main(String[] args)
	{
		try
		{
		Connection connection =	DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		
		Statement statement = connection.createStatement();
		
		String quiry = "CREATE DATABASE CollegeCompany";
		
		int rowAffected = statement.executeUpdate(quiry);
		
		System.out.println("Database Created Succesfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
