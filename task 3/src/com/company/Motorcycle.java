package com.company;

public class Motorcycle extends Transport{
    protected int wheelsNumber = 2;

    @Override
    public String getWheelsNumber() {
        return "Motorcycle has " + wheelsNumber + " wheels";
    }
}
