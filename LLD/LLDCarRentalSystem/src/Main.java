import model.*;
import service.CarRentalReservationSystem;
import service.UserService;
import service.VehicleService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, to the Car Rental System.");

        UserService userService = new UserService();

        VehicleService vehicleService = new VehicleService();

        CarRentalReservationSystem carRentalReservationSystem = new CarRentalReservationSystem();

        Location location1 = new Location(1, "Bangalore", "34.87", "87.7", "560037");
        Location location2 = new Location(2, "Coorg", "34.87", "87.7", "560037");
        User user = new User(1, "Hariram", "8094434344", "hariram@gmail.com", "AD321", location1);
        userService.addUser(user);

        Car car = new Car(1, "KA_HFV_1092", "Toyota", CarType.SEDAN, 1500, location1, Status.VACANT);
        Car car1 = new Car(2, "KA_HFV_9192", "Toyota", CarType.HATCHBACK, 7500, location1, Status.VACANT);
        vehicleService.addCars(car);
        vehicleService.addCars(car1);

        carRentalReservationSystem.reserveVehicle(user,  car, location1, location2, LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(5));
        carRentalReservationSystem.modifyBooking(1, LocalDateTime.now().plusDays(2), LocalDateTime.now().plusDays(8));
        carRentalReservationSystem.cancelBooking(1);

        vehicleService.getAllAvailableCars();

        carRentalReservationSystem.searchAvailableCars(location1.getLocation_name(), LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(4));
    }
}
