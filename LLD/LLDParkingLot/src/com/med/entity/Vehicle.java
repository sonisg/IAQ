package com.med.entity;

public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;
    String color;
    String ticketId;
    ParkingSlot parkingSlot;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle(VehicleType vehicleType, ParkingSlot parkingSlot, String color, String vehicleRegisterNo) {
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.color = color;
        this.vehicleNumber = vehicleRegisterNo;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
