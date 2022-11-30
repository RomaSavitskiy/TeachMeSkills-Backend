package com.mycompany.SOLID.secondExample.entity;

import com.mycompany.SOLID.secondExample.interfaces.Vehicle;

public class MonoCircle implements Vehicle {
    @Override
    public boolean isFlyable() {
        return true;
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public int getPassengersCount() {
        return 1;
    }
}
