package model;

import util.RandomGenerator;

import java.time.LocalDateTime;

public class Reserve {

    private Integer reserve_id;

    private User user;

    private Car car;

    private Location pickup;

    private Location drop;

    private int totalPrice;

    private LocalDateTime bookingFrom;

    private LocalDateTime bookingTo;

    private boolean isCancelled;

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public Reserve(User user, Car car, Location pickup, Location drop, LocalDateTime bookingFrom, LocalDateTime bookingTo) {
        this.reserve_id = RandomGenerator.getRandomNoGenerator();
        this.user = user;
        this.car = car;
        this.pickup = pickup;
        this.drop = drop;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
    }

    public Integer getReserve_id() {
        return reserve_id;
    }

    public void setReserve_id(Integer reserve_id) {
        this.reserve_id = reserve_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getPickup() {
        return pickup;
    }

    public void setPickup(Location pickup) {
        this.pickup = pickup;
    }

    public Location getDrop() {
        return drop;
    }

    public void setDrop(Location drop) {
        this.drop = drop;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(LocalDateTime bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public LocalDateTime getBookingTo() {
        return bookingTo;
    }

    public void setBookingTo(LocalDateTime bookingTo) {
        this.bookingTo = bookingTo;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "reserve_id=" + reserve_id +
                ", user=" + user +
                ", car=" + car +
                ", pickup=" + pickup +
                ", drop=" + drop +
                ", totalPrice=" + totalPrice +
                ", bookingFrom=" + bookingFrom +
                ", bookingTo=" + bookingTo +
                '}';
    }
}
