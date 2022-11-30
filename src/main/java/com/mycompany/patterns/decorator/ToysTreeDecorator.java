package com.mycompany.patterns.decorator;

public class ToysTreeDecorator extends ChristmasTreeDecorator{
    public ToysTreeDecorator(TreeDecorator treeDecorator) {
        super(treeDecorator);
    }

    @Override
    public String decorate() {
        return super.decorate() + withToys();
    }

    private String withToys() {
        return " with some toys";
    }
}
