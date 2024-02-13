package com.med.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {

    List<ParkingSlot> parkingSlots = null;

    public ParkingFloor(List<ParkingSlot> parkingSlots){
        this.parkingSlots = parkingSlots;

    }
    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}
