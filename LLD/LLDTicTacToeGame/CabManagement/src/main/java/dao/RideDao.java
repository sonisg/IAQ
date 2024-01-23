package dao;

import model.Ride;

import java.util.HashMap;

public class RideDao {

    public HashMap<Integer, Ride> rideHashMap;

    public RideDao() {
        this.rideHashMap = new HashMap<>();
    }

    public HashMap<Integer, Ride> getRideHashMap() {
        return rideHashMap;
    }

    public void setRideHashMap(HashMap<Integer, Ride> rideHashMap) {
        this.rideHashMap = rideHashMap;
    }
}
