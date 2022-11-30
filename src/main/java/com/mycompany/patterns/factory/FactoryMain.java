package com.mycompany.patterns.factory;

import com.mycompany.patterns.factory.ServiceVariationFactory.DoctorHealingFactory;
import com.mycompany.patterns.factory.ServiceVariationFactory.StandardHealingFactory;
import com.mycompany.patterns.factory.CratObjectFactory.*;

public class FactoryMain {
    public static void main(String[] args) {
        // Создание объектов до внедрения "фабрики"
        Doctor doc1 = new Dentist();
        Doctor doc2 = new Terapevt();

        // Создание объекта после внедрения "фабрики"
        /*Doctor doc3 = StandardDoctorFactory.getDoctorById(1);
        Doctor doc4 = StandardDoctorFactory.getDoctorById(2);*/

        // Создание объекта после внедрения "модернизированной фабрики"
        DoctorFactory factory = new MDoctorFactory();
        Doctor doc5 = factory.getDoctorById(2);
        factory = new StandardDoctorFactory();
        Doctor doc6 = factory.getDoctorById(1);

        DoctorHealingFactory doctorHealingFactory = new StandardHealingFactory();
        doctorHealingFactory.getHeal().heal();
        doctorHealingFactory.getBite().bite();
    }
}
