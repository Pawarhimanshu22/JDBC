package org.example;
import java.util.Scanner;

import java.sql.*;


public class PrepareStatementDemo
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

        /**  String query = "Delete from student where id = ?"; //Id number ki jagar ? lagaya h kisaka matlab default parameter h


            PreparedStatement preparedStatement = connection.prepareStatement(query);

            Scanner sc = new Scanner(System.in);1
            int studentId = sc.nextInt();

            preparedStatement.setInt(1,studentId);

            // preparedStatement.setInt(1,4); // pahale parameter pe ID set ho rahi h 4

            int rowAffected = preparedStatement.executeUpdate();


            System.out.println("row Affected : " + rowAffected);
**/


            // for inserting data via prepare statement or in prepare statement we can store dynamic values
            String insertQuery = "INSERT INTO STUDENT (id,name,city) values (?,?,?)";

            PreparedStatement preparedStatement1 = connection.prepareStatement(insertQuery);

            preparedStatement1.setInt(1,2); // PlaceHolder(id) + values(2)
            preparedStatement1.setString(2,"Himanshi");
            preparedStatement1.setString(3,"indore");

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
