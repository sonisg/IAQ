package model;

import util.CustomerNoGenerator;

public class Location {

    public Integer location_id;

    public String location_name;

    public Location(String location_name) {
        this.location_id = CustomerNoGenerator.getCustomerNoGenerator();
        this.location_name = location_name;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }
}
