package com.company;

public class Main {

    /**
     * Entry point
     */
    public static void main(String[] args) {
        Transport[] transports = {new Automobile(), new Motorcycle(), new Truck()};

        for (Transport transport: transports) {
            System.out.println(transport.getWheelsNumber());
        }
    }
}
