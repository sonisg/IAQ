package service;

import dao.UserDao;
import dao.VehicleDao;
import model.Car;
import model.Location;
import model.Reserve;
import model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CarRentalReservationSystem {

    private Integer BASE_PRICE_PER_DAY = 50;

    UserDao userDao = new UserDao();

    VehicleDao vehicleDao = new VehicleDao();

    List<Reserve> bookings = new ArrayList<>();

    VehicleService vehicleService = new VehicleService();

    public String reserveVehicle(User user, Car car, Location pickup, Location drop, LocalDateTime startTime, LocalDateTime endTime){
        Reserve reserve = new Reserve(user, car, pickup, drop, startTime, endTime);
        car.setAvailable(false);
        vehicleDao.getCarList().add(car);
        Integer rentalDays = endTime.getDayOfMonth() - startTime.getDayOfMonth();
        Integer rate = calculateTotalPrice(car, pickup, drop, rentalDays);
        reserve.setTotalPrice(rate);
        bookings.add(reserve);
        System.out.println("Booking Id: " + reserve.getReserve_id());
        System.out.println("Total amount to be paid: " + reserve.getTotalPrice());
        return reserve.toString();
    }

    public Integer calculateTotalPrice(Car car, Location pickupLocation, Location dropoffLocation, int rentalDays) {
        Integer pricePerKm = vehicleService.getRateOfVehiclePerHrPerKm(car);
        Integer distanceInKm = calculateDistance(pickupLocation, dropoffLocation);
        Integer totalPrice = (distanceInKm * pricePerKm) + BASE_PRICE_PER_DAY * rentalDays;
        return totalPrice;
    }

    private Integer calculateDistance(Location pickupLocation, Location dropoffLocation) {
        return 250;
    }

    public Reserve findByBookingId(Integer bookingId){
        for(Reserve reserve: bookings){
            if(reserve.getReserve_id()==bookingId){
                return reserve;
            }
        }
        return null;
    }

    public void cancelBooking(Integer bookingId){
        Reserve reserve = findByBookingId(bookingId);
        if (reserve != null) {
            reserve.setCancelled(true);
            reserve.getCar().setAvailable(true);
            System.out.println("Booking with ID " + bookingId + " has been canceled.");
        } else {
            System.out.println("Booking with ID " + bookingId + " not found.");
        }
    }

    public void modifyBooking(Integer bookingId, LocalDateTime newPickupDateTime, LocalDateTime newDropoffDateTime) {
        Reserve reserve = findByBookingId(bookingId);
        if (reserve != null) {
            reserve.setBookingTo(newDropoffDateTime);
            reserve.setBookingFrom(newPickupDateTime);
        } else {
            System.out.println("Booking Id :" + bookingId + " was not found");
        }
    }

    public List<Reserve> getBookings(){
        return bookings;
    }

    public List<Car> searchAvailableCars(String location, LocalDateTime pickupDateTime, LocalDateTime dropoffDateTime) {
        List<Car> availableCars = new ArrayList<>();

        for (Car car : vehicleDao.getCarList()) {
            if (car.isAvailable() &&
                    car.getLocation().getLocation_name().equalsIgnoreCase(location) &&
                    isBookingSlotAvailable(car, pickupDateTime, dropoffDateTime)) {
                availableCars.add(car);
                System.out.println("Car " + car.getCar_name() + " is available for the specified time slot.");
            }
        }

        if (availableCars.isEmpty()) {
            System.out.println("No available cars found for the specified location and time slot.");
        }

        return availableCars;
    }

    private boolean isBookingSlotAvailable(Car car, LocalDateTime pickupDateTime, LocalDateTime dropoffDateTime) {
        List<Reserve> bookings = getBookings();
        for (Reserve booking : bookings) {
            if (booking.getCar().equals(car) &&
                    !(dropoffDateTime.isBefore(booking.getBookingTo()) || pickupDateTime.isAfter(booking.getBookingFrom()))) {
                System.out.println("Car " + car.getCar_name() + " is booked during the specified time slot.");
                return false; // Car is booked during the specified time slot
            }
        }
        return true; // Car is available for the specified time slot
    }
}
