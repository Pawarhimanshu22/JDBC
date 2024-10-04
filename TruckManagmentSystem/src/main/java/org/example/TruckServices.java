package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//service layer

public class TruckServices {

    public void addTruck(Truck truck)
    {
        String sql = "INSERT INTO truck (name, model, capacity, driver_name) VALUES (?, ?, ?, ?)";

        try
        {
            Connection connection = ConnectionDetails.getconnection();

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,truck.getName());
            preparedStatement.setString(2,truck.getModel());
            preparedStatement.setInt(3,truck.getCapacity());
            preparedStatement.setString(4,truck.getDriverName());

            int Update = preparedStatement.executeUpdate();
            System.out.println("Row Inserted : " + Update);

        }

        catch (Exception e)
        {
            e.printStackTrace();

        }
    }


    public Truck getTruckById(int id)
    {
        String sql="select * from truck where id = ?";
        Truck truck = new Truck();
        try
        {
            Connection getconnection = ConnectionDetails.getconnection();
            PreparedStatement preparedStatement = getconnection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery(); // fetchingh ke liye use karate h
            if(resultSet.next())
            {
                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriverName(resultSet.getString("driver_name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return truck;
    }

    public void updateTruck(Truck truck)
    {
        String sql = "UPDATE truck SET name = ?, model = ?, capacity = ?, driver_name = ? WHERE id = ?";
        try
        {
            Connection getconnection = ConnectionDetails.getconnection();
            PreparedStatement preparedStatement = getconnection.prepareStatement(sql);

            preparedStatement.setString(1,truck.getName());
            preparedStatement.setString(2,truck.getModel());
            preparedStatement.setInt(3,truck.getCapacity());
            preparedStatement.setString(4,truck.getDriverName());
            preparedStatement.setInt(5,truck.getId());

            int update = preparedStatement.executeUpdate();
            System.out.println("Row Updated :" + update);


        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
    }
    public List<Truck> getAllTrucks()
    {
        String qsl = "select * from truck";

        List<Truck> trucks = new ArrayList<Truck>();
        try
        {
            Connection getconnection = ConnectionDetails.getconnection();
            Statement statement = getconnection.createStatement();
            ResultSet resultSet = statement.executeQuery(qsl);

            while (resultSet.next())
            {
                Truck truck=new Truck();

                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriverName(resultSet.getString("driver_name"));
                trucks.add(truck);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return trucks;
    }
    public void deleteTruck(int id)
    {
        String deleteQuery="delete from truck where id= ?";
        try {
            Connection connection = ConnectionDetails.getconnection();
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1,id);
            int update = preparedStatement.executeUpdate();
            System.out.println("Row Deleted : "+update);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
