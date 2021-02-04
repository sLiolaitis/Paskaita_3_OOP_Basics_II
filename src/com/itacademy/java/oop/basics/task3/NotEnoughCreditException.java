package com.itacademy.java.oop.basics.task3;

public class NotEnoughCreditException extends Exception{

    public NotEnoughCreditException() {
    }

    public NotEnoughCreditException(String message) {
        super(message);
    }
}
