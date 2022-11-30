package com.mycompany.patterns.factory.CratObjectFactory;

// Реализация самой простой фабрики
public class StandardDoctorFactory implements DoctorFactory {
    public Doctor getDoctorById(int id) {
        if (id == 1) {
            Terapevt terapevt = new Terapevt();
            terapevt.setCollectedChocolates(18);
            return terapevt;
        }
        if (id == 2) {
            Dentist dentist = new Dentist();
            dentist.setPrice(1500);
            dentist.setCollectedToothCount(300);
            return dentist;
        }

        return null;
    }
}
