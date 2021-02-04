package com.itacademy.java.oop.basics.task2;

public enum Bike {

    MOUNTAIN("mountain"),ROAD("road");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    Bike(String displayValue) {
        this.displayValue = displayValue;
    }
}
