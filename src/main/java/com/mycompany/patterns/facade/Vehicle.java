package com.mycompany.patterns.facade;

public class Vehicle {

    public void getFuel() {
        System.out.println("Fuel is inside vehicle");
    }

    public void burn() {
        System.out.println("fuel is burning");
    }

    public void moveWheels() {
        System.out.println("wheels are running");
    }

    public void stop() {
        System.out.println("vehicle has stooped");
    }
}
