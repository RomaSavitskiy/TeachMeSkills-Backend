package com.mycompany.patterns.factory.ServiceVariationFactory;

public class StandardHealingFactory implements DoctorHealingFactory{
    @Override
    public Heal getHeal() {
        return new StandardHeal();
    }

    @Override
    public Bite getBite() {
        return new NonStandardBite();
    }
}
