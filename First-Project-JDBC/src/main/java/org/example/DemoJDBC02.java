package org.example;


import java.sql.*;

public class DemoJDBC02 {

    public static void main(String[] args)
    {
        /*
        1. Import Package
        2. Load Driver
        3. Register Driver // now days these two steps are not imporant
        4. Create Connection
        5.  Create Statement
        6. Execute Statement
        7. close connection
         */
String url = "jdbc:mysql://localhost:3306/JDBCDB";
/*
Steps to writing URL
1. name jisako connect karana hai usaka or java jisaki help se connectho raha hai
2.  name jisako connect karana h usaka
3.host name kyonki yaha ham local machine me kam kar rahe h isliye LocalHost h or provide IP Address agar kisi network pe h to
4. Port number
5. name of databse.
 */
String userName = "root";

String password = "@#IFeelLikeKing22";

String query = "select * from Students";

        try
        {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Making connection
            Connection connectiopn = DriverManager.getConnection(url,userName,password);

            System.out.println("Connection stablished");

            //creating statement
            Statement statement = connectiopn.createStatement();

            //Execute Query
           ResultSet resultSet = statement.executeQuery(query);

          // System.out.println(resultSet.next());  

            while (resultSet.next()) {
                // Process and print each row
                int RollNumber = resultSet.getInt("RollNumber");
                String Name = resultSet.getString("Name");
                String City = resultSet.getString("City");//here i only fetchedd data and storing into variables from database by calling resultset
                // Add more columns as needed

                System.out.println("ID: " + RollNumber + ",    Name: " + Name + ",   city: " + City
                );//Here i am printing those data
            }

           connectiopn.close();

           System.out.println("connection closed");

        }
        catch (Exception e)
        {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();

        }

    }
}
