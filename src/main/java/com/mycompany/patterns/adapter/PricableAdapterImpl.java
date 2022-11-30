package com.mycompany.patterns.adapter;

public class PricableAdapterImpl implements PricableAdapter {
    private Pricable pricable;

    public PricableAdapterImpl(Pricable pricable) {
        this.pricable = pricable;
    }

    @Override
    public double getPrice() {
        return pricable.getPrice()*2.5;
    }
}
