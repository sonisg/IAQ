package dao;

import model.Driver;

import java.util.HashMap;

public class DriverDao {

    HashMap<Integer, Driver> driver ;

    public DriverDao() {
        this.driver = new HashMap<>();
    }

    public HashMap<Integer, Driver> getDriver() {
        return driver;
    }

    public void setDriver(HashMap<Integer, Driver> driver) {
        this.driver = driver;
    }
}
