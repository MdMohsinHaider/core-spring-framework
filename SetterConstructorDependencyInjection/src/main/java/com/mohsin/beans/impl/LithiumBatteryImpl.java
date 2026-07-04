package com.mohsin.beans.impl;

import com.mohsin.beans.Battery;

public class LithiumBatteryImpl implements Battery {
    @Override
    public void supplyPower() {
        System.out.println("Supplying power from Lithium Battery");
    }
}
