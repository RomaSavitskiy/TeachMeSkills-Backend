package com.mycompany.patterns.factory.ServiceVariationFactory;

public interface DoctorHealingFactory {
    Heal getHeal();
    Bite getBite();
}
