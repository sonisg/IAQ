package controller;

import dao.CustomerDAO;
import dao.LocationDao;
import model.Customer;
import model.Location;

public class LocationService {

    private LocationDao locationDao = new LocationDao();

    public Location createLocation(String location) {
        Location location1 = new Location(location);
        locationDao.getLocationHashMap().put(location1.getLocation_id(), location1);
        return location1;
    }
}
