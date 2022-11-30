package com.mycompany.patterns.decorator;

public class StarTreeDecorator extends ChristmasTreeDecorator{
    public StarTreeDecorator(TreeDecorator treeDecorator) {
        super(treeDecorator);
    }

    @Override
    public String decorate() {
        return super.decorate() + withStart();
    }

    private String withStart() {
        return " with Star on the top";
    }
}
