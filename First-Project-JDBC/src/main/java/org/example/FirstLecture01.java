//First File
package org.example;
// Step 1 : import Package
import java.sql.*;


public class FirstLecture01
{
    public static String Load_Driver  = "com.mysql.cj.jdbc.Driver";

    public static String URL = "jdbc:mysql://localhost:3306/DataBaseUseForJDBC";

    public static String PASSWORD = "@#IFeelLikeKing22";

    public static String USER_NAME = "root";


    public static void main( String[] args )
    {

      try {
          // Step 2 : Load Driver

          Class.forName(Load_Driver); //here we are loading the driver but now days systems are very smart we don't need of Loading driver because we are using jar file

          //Step 3 : Making connection

          Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);

          //Step 4 : Create statement

          Statement statement = connection.createStatement();

          //Create Query
          String query = "select * from Students";

          //Execute Query
          ResultSet resultSet = statement.executeQuery(query);

          while(resultSet.next())
          {
              int rollNumber = resultSet.getInt("RollNumber");


              String name = resultSet.getString("FirstName");
              String lastName = resultSet.getString("LastName");
              int age = resultSet.getInt("Age");
              String gender = resultSet.getString("Gender");


              Date dateOfBirth = resultSet.getDate("DateOfBirth");
              int yearOfStudy = resultSet.getInt("YearOfStudy");
              String department = resultSet.getString("Department");
              double cgpa = resultSet.getDouble("CGPA");
              String email = resultSet.getString("Email");
              String phoneNumber = resultSet.getString("PhoneNumber");
              String address = resultSet.getString("Address");
              String city = resultSet.getString("City");
              String state = resultSet.getString("State");
              String postcode = resultSet.getString("PostalCode");
              int admissionYear = resultSet.getInt("AdmissionYear");
              boolean scholarship = resultSet.getBoolean("Scholarship");
              boolean hostelResident = resultSet.getBoolean("HostelResident");
              String parentName = resultSet.getString("ParentName");
              String parentPhoneNumber = resultSet.getString("ParentPhoneNumber");


              System.out.println("Roll number : " + rollNumber + "First Name : " + name +
                      "Last Name : " + lastName + "Age : " + age + " Gender : " + gender +
                      "Date Of Birth : " + dateOfBirth + "Year of Study : " + yearOfStudy +
                      " Department : " + department + "CGPA : " + cgpa + "E-mail Id :" + email +
                      "Phone Number : " + phoneNumber + "Address : " + address + " City : " + city +
                      "State : " + state + "Postel Code :" + postcode + "Scholership :" +
                      scholarship + "Hostel Recident :" + hostelResident + "AdmissionYear : " +
                      admissionYear + " Parant Name : " + parentName + " Parant Phone Number : " +
                      parentPhoneNumber);
          }
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
