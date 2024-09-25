package org.example;
import java.sql.*;

public class ResultSet03 {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/jdbcdb";
        String USERNAME = "root";
        String PASSWORD = "@#IFeelLikeKing22";
        String QUERY = "select * from student";


        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(QUERY);

            while(resultSet.next()) {
                Thread.sleep(5000);
                // System.in.read(); // jo bhi variable dalte h usako read karata hai
                resultSet.refreshRow();
                System.out.println(resultSet.getInt(1)
                        + "  " + "  " + resultSet.getString(2) // for fetching data column vise
                        + "  " + " " + resultSet.getString(3));

            }
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println("Exceptiom " + e);
        }
    }
}
