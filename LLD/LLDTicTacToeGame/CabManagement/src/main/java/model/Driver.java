package model;

import util.DriverNoGenerator;

public class Driver {

    public Integer driver_id;

    public String driver_name;

    public Driver(String driver_name) {
        this.driver_id = DriverNoGenerator.getDriverNoGenerator();
        this.driver_name = driver_name;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }
}
