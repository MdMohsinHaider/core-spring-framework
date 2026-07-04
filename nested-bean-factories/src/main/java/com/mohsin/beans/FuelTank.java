package com.mohsin.beans;

import org.springframework.stereotype.Component;

@Component
public class FuelTank {
    private int capacity;
    private String fuelType;

    public FuelTank(int capacity, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "FuelTank{" +
                "capacity=" + capacity +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
