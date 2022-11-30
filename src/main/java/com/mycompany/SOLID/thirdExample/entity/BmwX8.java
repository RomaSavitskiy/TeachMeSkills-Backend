package com.mycompany.SOLID.thirdExample.entity;

import com.mycompany.SOLID.secondExample.interfaces.SingleDriverVehicle;

public class BmwX8 implements SingleDriverVehicle {
    @Override
    public boolean isFlyable() {
        return false;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public String getColour() {
        return null;
    }
}
