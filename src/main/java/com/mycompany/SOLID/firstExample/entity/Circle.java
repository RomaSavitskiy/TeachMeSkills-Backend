package com.mycompany.SOLID.firstExample.entity;

import com.mycompany.SOLID.firstExample.interfaces.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Circle implements Shape {
    private int radius;

    @Override
    public int getPerimeter() {
        return 6 * radius;
    }
}
