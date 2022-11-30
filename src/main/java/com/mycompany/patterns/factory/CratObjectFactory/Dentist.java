package com.mycompany.patterns.factory.CratObjectFactory;

public class Dentist implements Doctor{
    private long price;
    private long collectedToothCount;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getCollectedToothCount() {
        return collectedToothCount;
    }

    public void setCollectedToothCount(long collectedToothCount) {
        this.collectedToothCount = collectedToothCount;
    }

    @Override
    public void heal() {

    }

    @Override
    public void bite() {

    }
}
