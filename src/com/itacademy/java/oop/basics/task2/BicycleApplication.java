package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public class BicycleApplication {

    public static void main(String[] args) {
        MountainBike carbon2000 = new MountainBike(12, 30);
        RoadBike bullet = new RoadBike(6, 30);

        try {
            carbon2000.applyBrakes(50);
        } catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }

        try {
            carbon2000.speedUp(-1);
        } catch (ArithmeticException b) {
            System.out.println(b.getMessage());
        }

        try {
            carbon2000.changeGear(5);
        } catch (ArithmeticException c) {
            System.out.println(c.getMessage());
        }

        bullet.applyBrakes(-10);

        try {
            bullet.speedUp(10);
        } catch (ArithmeticException d) {
            System.out.println(d.getMessage());
        }

        bullet.changeGear(-2);

        Speedometer speedometer = new Speedometer();

        try {
        System.out.println(speedometer.chooseWinner(carbon2000, bullet)+" Bike is faster!"); }
         catch (ArithmeticException f) {
             System.out.println(f.getMessage());
         }




    }

}
