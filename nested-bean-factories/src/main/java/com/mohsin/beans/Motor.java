package com.mohsin.beans;

import org.springframework.stereotype.Component;

@Component
public class Motor {

    private FuelTank fuelTank;

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void run(){
        System.out.println("Motor is running with "+ fuelTank);
    }
}
