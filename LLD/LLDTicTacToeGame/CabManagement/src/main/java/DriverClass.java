import controller.CustomerService;
import controller.DriverService;
import controller.LocationService;
import controller.RideService;

public class DriverClass {

    public static void main(String[] args) {
        CustomerService customerService= new CustomerService();
        customerService.createCustomer("Shivam", "80956");

        DriverService driverService = new DriverService();
        driverService.createDriver("Param");

        LocationService locationService = new LocationService();
        locationService.createLocation("Kormangla");
        locationService.createLocation("Indiranagar");

        RideService rideService = new RideService();
        rideService.bookRide(1,1,1,2);
    }
}
