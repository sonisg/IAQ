package model;

public class Car {
    private Integer car_id;

    private String car_name;

    private String brand;

    private CarType carType;

    private Integer carDriven;

    private Location location;

    private Status status;

    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public Car(Integer car_id, String car_name, String brand, CarType carType, Integer carDriven, Location location, Status status) {
        this.car_id = car_id;
        this.car_name = car_name;
        this.brand = brand;
        this.carType = carType;
        this.carDriven = carDriven;
        this.location = location;
        this.status = status;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Integer getCarDriven() {
        return carDriven;
    }

    public void setCarDriven(Integer carDriven) {
        this.carDriven = carDriven;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
