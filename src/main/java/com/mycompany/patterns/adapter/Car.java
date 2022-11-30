package com.mycompany.patterns.adapter;

public class Car implements Pricable{
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
