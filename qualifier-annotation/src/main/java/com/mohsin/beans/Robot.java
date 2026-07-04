package com.mohsin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    private final Sensor sensor;

    @Autowired
    public Robot(@Qualifier("sonicSensor") Sensor sensor) {
        this.sensor = sensor;
    }

    public void walk(){
        sensor.detect();
        System.out.println("walking ......");
    }
}
