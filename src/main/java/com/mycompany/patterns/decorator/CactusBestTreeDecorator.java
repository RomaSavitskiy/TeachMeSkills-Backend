package com.mycompany.patterns.decorator;

public class CactusBestTreeDecorator extends ChristmasTreeDecorator{
    public CactusBestTreeDecorator(TreeDecorator treeDecorator) {
        super(treeDecorator);
    }

    @Override
    public String decorate() {
        return super.decorate() + withBottle();
    }

    private String withBottle() {
        return " with bottle";
    }
}
