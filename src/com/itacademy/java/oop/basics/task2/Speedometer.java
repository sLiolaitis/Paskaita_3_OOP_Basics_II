package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public Speedometer() {
    }

    public static Bike chooseWinner (MountainBike mountainBike, RoadBike roadBike){
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return Bike.MOUNTAIN;
        } else if (mountainBike.getSpeed() == roadBike.getSpeed()){
            throw new ArithmeticException("Speeds are equal  ☺");
        } else {
            return Bike.ROAD;
        }

    }



}
