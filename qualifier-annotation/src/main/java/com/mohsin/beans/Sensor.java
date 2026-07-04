package com.mohsin.beans;

public class Sensor {
    private String type;

    public Sensor(String type) {
        this.type = type;
    }

    public void detect(){
        System.out.println("Sensor of type " + this.type+" is detecting Objects");
    }
}
