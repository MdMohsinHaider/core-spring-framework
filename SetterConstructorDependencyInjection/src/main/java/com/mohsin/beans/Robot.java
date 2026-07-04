package com.mohsin.beans;

public class Robot {
    private Battery battery;

    // Constructor Dependency injection.
    public Robot(Battery battery) {
        System.out.println("Robot(battery)");
        this.battery = battery;
    }

    public void  powerOn() {
        battery.supplyPower();
        System.out.println("Robot powered on");
    }

    // Setter Dependency injection.
    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
