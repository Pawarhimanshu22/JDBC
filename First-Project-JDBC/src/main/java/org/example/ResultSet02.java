package org.example;


import java.sql.*; // Import the package

public class ResultSet02 {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/jdbcdb";
        String USERNAME = "root";
        String PASSWORD = "@#IFeelLikeKing22";
        String QUERY = "select * from student";

        try
        {
            //Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            // Register Driver And Create connection

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); //ctrl+alt+v
            System.out.println("Connection Stablished");

            //  Create Statement
//           Statement statement =  connection.createStatement(
//            ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE
//           );

            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement Created");

           //Execute Statement
            ResultSet resultSet = statement.executeQuery(QUERY);
            System.out.println("Statement executed");

            resultSet.last(); //for getting last row from db
            System.out.println("Fetching the last row ");
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            String city = resultSet.getString("city");
//            System.out.println("ID : " + id + "  , Name : " + name + "  , City : " + city);

             System.out.println("ID : " + resultSet.getInt("id"));
             System.out.println("Name : "+ resultSet.getString("name"));
            System.out.println("city : " + resultSet.getString("city"));

             resultSet.first(); // for getting First row from db
            System.out.println("Fatching the first row ");
            System.out.println("ID : " + resultSet.getInt("id"));
            System.out.println("Name : " + resultSet.getString("name"));
            System.out.println("City : " + resultSet.getString("city"));

            resultSet.updateString("name" , "Alpha" ); //For updating Himanshu to alpha
            resultSet.updateRow();


            resultSet.moveToInsertRow(); // for creating a new empty row
            resultSet.updateInt("id",6);
            resultSet.updateString("name" , "ishita");
            resultSet.updateString("city", "Indore");
            resultSet.insertRow(); //for inserting the row in db from java app

            resultSet.last();
            System.out.println("Fatching the last row ");
            System.out.println("ID : " + resultSet.getInt("id"));
            System.out.println("Name : " + resultSet.getString("name"));
            System.out.println("City : " + resultSet.getString("city"));


//           while(resultSet.next())
//           {
//               int id = resultSet.getInt("id");
//               String name = resultSet.getString("name");
//               String city = resultSet.getString("city");
//
//               System.out.println("ID : " + id + " , Name : " + name + "  ,City" + city);
//           }

           connection.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }
}
