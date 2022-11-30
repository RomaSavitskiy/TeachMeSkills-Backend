package com.mycompany.SOLID.secondExample.entity;

import com.mycompany.SOLID.secondExample.interfaces.Passengerable;
import com.mycompany.SOLID.secondExample.interfaces.SingleDriverVehicle;
import com.mycompany.SOLID.secondExample.interfaces.Vehicle;

public class Bmw implements SingleDriverVehicle, Passengerable {
    @Override
    public boolean isFlyable() {
        return false;
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public String getColour() {
        return "black";
    }

    @Override
    public int getPassenger() {
        return 0;
    }
}
