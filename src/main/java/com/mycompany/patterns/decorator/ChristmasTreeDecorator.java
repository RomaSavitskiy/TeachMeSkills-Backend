package com.mycompany.patterns.decorator;

public abstract class ChristmasTreeDecorator implements TreeDecorator {
    private TreeDecorator treeDecorator;

    public ChristmasTreeDecorator(TreeDecorator treeDecorator) {
        this.treeDecorator = treeDecorator;
    }

    @Override
    public String decorate() {
        return treeDecorator.decorate();
    }
}
