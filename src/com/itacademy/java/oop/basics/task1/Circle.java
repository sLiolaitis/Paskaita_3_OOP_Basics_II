package com.itacademy.java.oop.basics.task1;

import java.text.DecimalFormat;

public class Circle extends Shape {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    private double radius;
    private double pi = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return this.pi*(Math.pow(this.radius, 2));
    }

    @Override
    double calculatePerimeter() {
        return 2*this.pi*this.radius;
    }

    @Override
    public String toString() {
        return "Radius of circle is "+this.radius+"\nArea is "+df2.format(calculateArea())+
                "\nPerimeter is "+df2.format(calculatePerimeter());
    }
}
