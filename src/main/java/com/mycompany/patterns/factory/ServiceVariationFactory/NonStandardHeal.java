package com.mycompany.patterns.factory.ServiceVariationFactory;

public class NonStandardHeal implements Heal {
    @Override
    public void heal() {
        System.out.println("boom");
    }
}
