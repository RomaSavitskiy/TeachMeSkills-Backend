package com.mycompany.patterns.facade;

public class CarFacade {
    private Starter starter = new Starter();
    private Vehicle vehicle = new Vehicle();

    public void start() {
        starter.start();
        vehicle.getFuel();
        vehicle.burn();
        vehicle.moveWheels();
    }

    public void stop() {
        starter.stop();
        vehicle.stop();
    }
}
