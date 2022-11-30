package com.mycompany.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Pricable car = new Car(140000);
        System.out.println(car.getPrice());

        PricableAdapter car2 = new PricableAdapterImpl(car);
        System.out.println(car2.getPrice());
    }
}
