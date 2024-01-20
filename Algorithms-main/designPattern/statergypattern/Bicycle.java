package com.company.designpattern.statergypattern;

public class Bicycle extends Vehicle{
    public Bicycle() {
        super(new SpecialDrive());
    }
}
