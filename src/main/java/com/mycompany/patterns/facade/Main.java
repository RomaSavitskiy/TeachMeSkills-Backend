package com.mycompany.patterns.facade;

public class Main {
    public static void main(String[] args) {
       /* Starter starter = new Starter();
        Vehicle vehicle = new Vehicle();

        starter.start();
        vehicle.getFuel();
        vehicle.burn();
        vehicle.moveWheels();

        System.out.println("car is moving to the ned");

        starter.stop();
        vehicle.stop();

        System.out.println("car is stopped");*/

        CarFacade carFacade = new CarFacade();
        carFacade.start();
        System.out.println("car is moving to the ned");
        carFacade.stop();
        System.out.println("car is stopped");
    }
}
