package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {

    private int gear;
    private int speed;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        switch (newGear) {
            case 1:
                if ((newGear + this.gear) > 20) {
                    System.out.println("Maximum gear is already reached, it is not possible to add a gear");
                } else {
                    System.out.println("Gear is changed. Now it's in " + (newGear + this.gear) + " gear.");
                }
                break;
            case -1:
                if ((newGear + this.gear) < 0) {
                    throw new ArithmeticException("Minimum gear is already reached, it is not possible to go lower");
                } else {
                    System.out.println("Gear is changed. Now it's in " + (newGear + this.gear) + " gear.");
                }
                break;
            default:
                throw new ArithmeticException("You can change only one gear at once!");


        }
    }

    @Override
    public void speedUp(int increment) {
        int temp = this.speed;
        temp += increment;
        if (increment < 0) {
            throw new ArithmeticException("You gave a negative number!  You should use a positive number");
        } else if (temp > 100) {
            throw new ArithmeticException("Increment is too high! Biggest allowed increment is: " + Math.abs(100 - this.speed));
        } else {
            System.out.println("Speed was incremented successfully! Now bike's speed is: " + (this.speed + increment));
        }

    }

    @Override
    public void applyBrakes(int breaks) {
        int temp = this.speed;
        temp -= breaks;
        if (breaks < 0) {
            throw new ArithmeticException("Breaking value cat not be a negative number!");
        } else if (temp < -10) {
            System.out.println("Breaking value is too high!");
            int maxBreakingValue = Math.abs(this.speed - (-10));
            System.out.println("Biggest breaking value allowed is: " + maxBreakingValue);
        } else {
            System.out.println("Bike's speed is successfully decreased!\nCurrent speed: " + this.speed);
        }
    }
}
