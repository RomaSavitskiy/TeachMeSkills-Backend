package com.mycompany.SOLID.thirdExample.entity;

import com.mycompany.SOLID.secondExample.entity.Bmw;
import com.mycompany.SOLID.secondExample.interfaces.SingleDriverVehicle;
import lombok.AllArgsConstructor;
import lombok.Data;

public class VehicleStore {
    private SingleDriverVehicle bmw;

    public VehicleStore(SingleDriverVehicle bmw) {
        this.bmw = bmw;
    }

    public SingleDriverVehicle getBmw() {
        return bmw;
    }
}
