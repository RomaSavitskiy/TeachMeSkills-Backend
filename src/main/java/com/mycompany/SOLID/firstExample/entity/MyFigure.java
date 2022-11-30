package com.mycompany.SOLID.firstExample.entity;

import com.mycompany.SOLID.firstExample.interfaces.Shape;

import java.util.Random;

public class MyFigure implements Shape {
    @Override
    public int getPerimeter() {
        return new Random().nextInt();
    }
}
