package org.example;
import java.sql.*;

public class ConnectionDetails {

    public static final String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";

    public static final String URL = "jdbc:mysql://localhost:3306/TruckManagmentSystem";

    public static final String PASSWORD = "@#IFeelLikeKing22";

    public static final String USER_NAME = "root";

public static Connection getconnection() throws  SQLException
    {
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }
}
