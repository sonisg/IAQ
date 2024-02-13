package com.med.entity;

public class ParkingSlot {
    int floorId;
    private int slotId;
    private Vehicle vehicle;
    private SlotType slotType;
    private boolean isFree;
    VehicleType vehicleType;

    public ParkingSlot(VehicleType vehicleType, boolean isFree,int slotId) {
        this.vehicleType = vehicleType;
        this.isFree = isFree;
        this.slotId = slotId;
    }

    public int getSlotId() {
        return slotId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
