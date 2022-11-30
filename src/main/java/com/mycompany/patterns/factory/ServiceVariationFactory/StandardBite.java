package com.mycompany.patterns.factory.ServiceVariationFactory;

public class StandardBite implements Bite {
    @Override
    public void bite() {
        System.out.println("Boooom!!!");
    }
}
