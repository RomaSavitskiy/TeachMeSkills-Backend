package com.mycompany.SOLID.secondExample;

import com.mycompany.SOLID.secondExample.entity.Bmw;
import com.mycompany.SOLID.secondExample.entity.Boeing;
import com.mycompany.SOLID.secondExample.interfaces.SingleDriverVehicle;
import com.mycompany.SOLID.secondExample.interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        SingleDriverVehicle vehicle = new Bmw();

        if (vehicle.isFlyable()) {
            System.out.println("This vehicle is flying and has " + vehicle.getWeight() + " mass");
        } else {
            System.out.println("This vehicle is not flying and has " + vehicle.getWeight() + " mass");
        }
    }
}
