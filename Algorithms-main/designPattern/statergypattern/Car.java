package com.company.designpattern.statergypattern;

public class Car extends Vehicle{

    public Car() {
        super(new NormalDrive());
    }
}
