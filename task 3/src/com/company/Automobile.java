package com.company;

public class Automobile extends Transport {
    protected int wheelsNumber = 4;

    @Override
    public String getWheelsNumber() {
        return "Automobile has " + wheelsNumber + " wheels";
    }
}
