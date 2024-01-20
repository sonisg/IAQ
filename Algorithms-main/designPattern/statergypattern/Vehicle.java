package com.company.designpattern.statergypattern;

public class Vehicle {

    DriveType driveType;

    public Vehicle(DriveType driveType) {
        this.driveType = driveType;
    }
    public void drive(){
        driveType.drive();
    }
}
