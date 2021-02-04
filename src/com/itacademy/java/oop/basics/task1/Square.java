package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow((this.side),2);
    }

    @Override
    double calculatePerimeter() {
        return this.side*4;
    }

    @Override
    public String toString() {
        return "Side is "+side+"\nArea is "+calculateArea()+"\nPerimeter is "+calculatePerimeter();
    }
}
