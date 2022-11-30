package com.mycompany.patterns.factory.CratObjectFactory;

public class Terapevt implements Doctor {
    private int collectedChocolates;

    public int getCollectedChocolates() {
        return collectedChocolates;
    }

    public void setCollectedChocolates(int collectedChocolates) {
        this.collectedChocolates = collectedChocolates;
    }

    @Override
    public void heal() {

    }

    @Override
    public void bite() {

    }
}
