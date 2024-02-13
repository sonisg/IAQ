package controller;

import dao.CustomerDAO;
import dao.DriverDao;
import dao.LocationDao;
import dao.RideDao;
import model.Customer;
import model.Driver;
import model.Location;
import model.Ride;

public class RideService {

    DriverDao driverDao = new DriverDao();

    CustomerDAO customerDAO = new CustomerDAO();

    LocationDao locationDao = new LocationDao();

    RideDao rideDao = new RideDao();

    public Ride bookRide(Integer driver, Integer customer, Integer source, Integer destination){
       Customer customerDetails = customerDAO.getCustomerHashMap().get(customer);
       Driver driver1 = driverDao.getDriver().get(driver);
       Location startLocation = locationDao.getLocationHashMap().get(source);
       Location endLocation = locationDao.getLocationHashMap().get(destination);

       Ride ride1 = new Ride(driver1, customerDetails, startLocation, endLocation, "cash", "123");
       rideDao.getRideHashMap().put(ride1.getRideId(), ride1);
       System.out.println("Ride Number"+ ride1.getRideId());
       System.out.println("Fare" + ride1.getFare());
       return null;
    }
}
