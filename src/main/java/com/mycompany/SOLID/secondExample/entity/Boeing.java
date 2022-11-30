package com.mycompany.SOLID.secondExample.entity;

import com.mycompany.SOLID.secondExample.interfaces.Passengerable;
import com.mycompany.SOLID.secondExample.interfaces.SingleDriverVehicle;
import com.mycompany.SOLID.secondExample.interfaces.Vehicle;

public class Boeing implements Passengerable, SingleDriverVehicle {
    private int weight;

    @Override
    public boolean isFlyable() {
        return true;
    }

    @Override
    public int getWeight() {
        return 10000;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public int getPassenger() {
        return 0;
    }
}
