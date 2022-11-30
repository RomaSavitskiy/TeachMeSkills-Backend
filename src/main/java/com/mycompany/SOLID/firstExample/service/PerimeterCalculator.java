package com.mycompany.SOLID.firstExample.service;

import com.mycompany.SOLID.firstExample.interfaces.Shape;

public class PerimeterCalculator {
    public int getPerimeter(Shape shape) {
        return shape.getPerimeter();
    }
}
