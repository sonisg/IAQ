package com.med.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private static ParkingLot instance;
    private String parkingLotId;
    private int noOfFloors;
    private int noOfSlotsPerFloor;
    List<ParkingFloor> parkingFloors;

    public int getNoOfSlotsPerFloor() {
        return noOfSlotsPerFloor;
    }

    public void setNoOfSlotsPerFloor(int noOfSlotsPerFloor) {
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }

    public ParkingLot(String parkingLotId, int noOfFloors, int noOfSlotsPerFloor) {
        this.parkingLotId = parkingLotId;
        this.noOfFloors = noOfFloors;
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }

    public static ParkingLot getInstance() {
        return instance;
    }

    public static void setInstance(ParkingLot instance) {
        ParkingLot.instance = instance;
    }

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
