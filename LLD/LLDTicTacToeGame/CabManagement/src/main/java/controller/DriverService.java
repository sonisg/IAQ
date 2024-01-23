package controller;

import dao.DriverDao;
import model.Driver;

public class DriverService {

    DriverDao driverDao = new DriverDao();

    public Driver createDriver(String name ){
        Driver driver = new Driver(name);
        driverDao.getDriver().put(driver.driver_id, driver);
        return driver;
    }
}
