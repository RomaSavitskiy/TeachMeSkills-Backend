package com.mycompany.SOLID.firstExample.entity;

import com.mycompany.SOLID.firstExample.interfaces.Shape;
import lombok.Data;

@Data
public class Triangle implements Shape {
    private int a, b, c;

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
}
