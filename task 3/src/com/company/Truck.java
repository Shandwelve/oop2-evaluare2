package com.company;

public class Truck extends Transport {
    protected int wheelsNumber = 6;

    @Override
    public String getWheelsNumber() {
        return "Truck has " + wheelsNumber + " wheels";
    }
}
