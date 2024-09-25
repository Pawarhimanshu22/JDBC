package org.example;

import java.sql.*;


public class DeleteDemo
{
    public static String Load_Driver  = "com.mysql.cj.jdbc.Driver";

    public static String URL = "jdbc:mysql://localhost:3306/jdbcdb";

    public static String PASSWORD = "@#IFeelLikeKing22";

    public static String USER_NAME = "root";

    public static void main( String[] args )
    {

        try {
            //Load Driver

            Class.forName(Load_Driver); //here we are loading the driver but now days systems are very smart we dont need of driver because we are using jar file

            //Making connection

            Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);

            //Create statement

            Statement statement = connection.createStatement();

            //Create Query
            String query = "Delete from student where id = 06" ;

//            ResultSet resultSet = statement.executeQuery(query); // this is for insertion data in db

            int rowAffected = statement.executeUpdate(query);

            System.out.println("Row Affected : " + rowAffected);      // this id for deletion but here is the problem whenever er delete a row in DB then we have to change in DB but here we can find which row we are deleting but i real world it is not possible so


//          resultSet.close();
//          statement.close();

            connection.close();


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
