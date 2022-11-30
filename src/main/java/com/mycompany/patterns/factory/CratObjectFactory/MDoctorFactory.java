package com.mycompany.patterns.factory.CratObjectFactory;

// Реализация модернизированной "фабрики"
public class MDoctorFactory implements DoctorFactory {
    public Doctor getDoctorById(int id) {
        if (id == 1) {
            Terapevt terapevt = new Terapevt();
            terapevt.setCollectedChocolates(188);
            return terapevt;
        }
        if (id == 2) {
            Dentist dentist = new Dentist();
            dentist.setPrice(1200);
            dentist.setCollectedToothCount(500);
            return dentist;
        }
        if (id == 3) {
            Dentist dentist = new Dentist();
            dentist.setPrice(100);
            dentist.setCollectedToothCount(200);
            return dentist;
        }

        return null;
    }
}
