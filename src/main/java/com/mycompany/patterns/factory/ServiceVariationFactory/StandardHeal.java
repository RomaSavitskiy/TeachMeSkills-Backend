package com.mycompany.patterns.factory.ServiceVariationFactory;

public class StandardHeal implements Heal {
    @Override
    public void heal() {
        System.out.println("Pssshhhh");
    }
}
