package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle{

    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
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
            case 2:
                if ((this.gear+newGear)>10) {
                    System.out.println("Max gear reached");
                } else {
                    System.out.println("Gear changed! Now it's "+(this.gear+newGear)+" :)");
                }
                break;
            case -1:
            case -2:
                if((this.gear+newGear)<0) {
                    System.out.println("Min gear reached");
                } else {
                    System.out.println("Gear changed! Now it's "+(this.gear+newGear)+" :)");
                }
                break;
            default:
                System.out.println("Invalid input. You can type in: -2, -1, 1 or 2");
        }

    }

    @Override
    public void speedUp(int increment) {
        if (increment<0) {
            throw new ArithmeticException("You used a negative incrementation value! Use positive!");
        } else if ((increment+this.speed)>50) {
            System.out.println("Max speed is exceeded! Max increment you can choose is: "+(50-this.speed));
        } else {
            System.out.println("Speed incremented. Now it is: "+(increment+this.speed));
        }
    }

    @Override
    public void applyBrakes(int brakes) {
        int temp = this.speed;
        temp+=brakes;
        if (brakes >= 0) {
            System.out.println("You are not allowed to use positive braking values! Use negative ones!");
        } else if (temp<0) {
            System.out.println("This bicycle can not go backwards! Entered value is invalid!");
        }else {
            System.out.println("Brakes applied. Bike speed is: "+temp);
            }
    }
}
