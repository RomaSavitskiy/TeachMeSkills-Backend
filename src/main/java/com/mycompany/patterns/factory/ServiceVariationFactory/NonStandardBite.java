package com.mycompany.patterns.factory.ServiceVariationFactory;

public class NonStandardBite implements Bite {
    @Override
    public void bite() {
        System.out.println("chmok");
    }
}
