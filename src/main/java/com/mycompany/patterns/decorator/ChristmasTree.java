package com.mycompany.patterns.decorator;

public class ChristmasTree implements TreeDecorator {
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
