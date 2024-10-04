package org.example;


import java.sql.*; // Import the package

public class ResultSet03 {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/JDBCDB";
        String USERNAME = "root";
        String PASSWORD = "@#IFeelLikeKing22";
        String QUERY = "select * from Students";

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

//            int RollNumber = resultSet.getInt("RollNumber");
//            String Name = resultSet.getString("Name");
//            String City = resultSet.getString("City");
//           System.out.println("RollNumber : " + RollNumber + "  , Name : " + Name + "  , City : " + City);

             System.out.println("RollNumber : " + resultSet.getInt("RollNumber"));
             System.out.println("Name : "+ resultSet.getString("Name"));
            System.out.println("City : " + resultSet.getString("City"));

             resultSet.first(); // for getting First row from db
            System.out.println("Fatching the first row ");
            System.out.println("RollNumber : " + resultSet.getInt("RollNumber"));
            System.out.println("Name : " + resultSet.getString("Name"));
            System.out.println("City : " + resultSet.getString("City"));

            resultSet.updateString("Name" , "Alpha" ); //For updating Himanshu Pawar to Alpha
            resultSet.updateRow();

            resultSet.moveToInsertRow(); // for creating a new empty row
            resultSet.updateInt("RollNumber",6);
            resultSet.updateString("Name" , "ishita");
            resultSet.updateString("City", "Indore");
            resultSet.insertRow(); //for inserting the row in db from java app

            resultSet.last();
            System.out.println("Fatching the last row ");
            System.out.println("RollNumber: " + resultSet.getInt("RollNumber"));
            System.out.println("Name : " + resultSet.getString("Name"));
            System.out.println("City : " + resultSet.getString("City"));


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
