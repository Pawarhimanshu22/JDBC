package org.example;
import java.util.Scanner;

import java.sql.*;


public class PrepareStatementDemo06
{
    public static String Load_Driver  = "com.mysql.cj.jdbc.Driver";

    public static String URL = "jdbc:mysql://localhost:3306/JDBCDB";

    public static String PASSWORD = "@#IFeelLikeKing22";

    public static String USER_NAME = "root";

    public static void main( String[] args )
    {

        try {
            //Load Driver

            Class.forName(Load_Driver); //here we are loading the driver but now days systems are very smart we dont need of driver because we are using jar file

            //Making connection

            Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);

            /**
          String query = "Delete from Students where RollNumber = ?"; //RollNumber number ki jagar / lagaya h kisaka matlab default parameter h

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            int studentRollNumber = sc.nextInt();

            preparedStatement.setInt(1,studentRollNumber);

            // preparedStatement.setInt(1,4); // pahale parameter pe ID set ho rahi h 4

            int rowAffected = preparedStatement.executeUpdate();


            System.out.println("row Affected : " + rowAffected);
             **/



            // for inserting data via prepare statement or in prepare statement we can store dynamic values

            String insertQuery = "INSERT INTO STUDENTS (RollNumber,Name,City) values (?,?,?)";

            PreparedStatement preparedStatement1 = connection.prepareStatement(insertQuery);

            Scanner sc = new Scanner(System.in);
            int rollNumber = sc.nextInt();
            String name = sc.next();
            String  city = sc.next();

            preparedStatement1.setInt(1,rollNumber);
            preparedStatement1.setString(2,name);
            preparedStatement1.setString(3,city);

            /*

            preparedStatement1.setInt(1,6); //  parameterIndex means ? hai & RollNumber(06)
            preparedStatement1.setString(2,"Himanshi");
            preparedStatement1.setString(3,"indore");

            */

            int update = preparedStatement1.executeUpdate();


            System.out.println("Row Impacted :" + update);



            connection.close();


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
