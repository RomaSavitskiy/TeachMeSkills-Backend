package com.mycompany.patterns.adapter;

public class ZLTPricableAdapterImpl implements PricableAdapter {
    private Pricable pricable;

    public ZLTPricableAdapterImpl(Pricable pricable) {
        this.pricable = pricable;
    }

    @Override
    public double getPrice() {
        return pricable.getPrice()*0.8;
    }
}
