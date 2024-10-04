package org.example;
//Daw data acces object

public class Truck {

    private int id;
    private String name;
    private String model;
    private int capacity;
    private String driverName;



    public Truck()
    {

    }

    public Truck(String name, String model, String driverName, int capacity) {
        this.name = name;
        this.model = model;
        this.driverName = driverName;
        this.capacity = capacity;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", driverName='" + driverName + '\'' +
                '}';
    }
}

