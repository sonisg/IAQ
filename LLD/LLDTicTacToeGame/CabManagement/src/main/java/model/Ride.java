package model;

import util.RideGenerator;

public class Ride {

    public Integer rideId;

    public Driver driver;

    public Customer customer;

    public Location source;

    public Location destination;

    public String paymentMode;

    public String fare;


    public Ride(Driver driver, Customer customer, Location source, Location destination, String paymentMode, String fare) {
        this.rideId = RideGenerator.getRideNoGenerator();
        this.driver = driver;
        this.customer = customer;
        this.source = source;
        this.destination = destination;
        this.paymentMode = paymentMode;
        this.fare = fare;
    }

    public Integer getRideId() {
        return rideId;
    }

    public void setRideId(Integer rideId) {
        this.rideId = rideId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}
