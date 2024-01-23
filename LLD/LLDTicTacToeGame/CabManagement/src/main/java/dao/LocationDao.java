package dao;

import model.Location;

import java.util.HashMap;

public class LocationDao {

    HashMap<Integer, Location> locationHashMap;

    public LocationDao() {
        this.locationHashMap = new HashMap<>();
    }

    public HashMap<Integer, Location> getLocationHashMap() {
        return locationHashMap;
    }

    public void setLocationHashMap(HashMap<Integer, Location> locationHashMap) {
        this.locationHashMap = locationHashMap;
    }
}
