package com.mycompany.SOLID.firstExample;

import com.mycompany.SOLID.firstExample.entity.MyFigure;
import com.mycompany.SOLID.firstExample.entity.MySecondFigure;
import com.mycompany.SOLID.firstExample.service.PerimeterCalculator;

public class Main {
    public static void main(String[] args) {
        PerimeterCalculator calculator = new PerimeterCalculator();
        calculator.getPerimeter(new MyFigure());
        calculator.getPerimeter(new MySecondFigure());
    }
}
