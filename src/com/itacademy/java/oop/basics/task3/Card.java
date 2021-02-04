package com.itacademy.java.oop.basics.task3;

public abstract class Card {

    private double balance;
    private static String cardHolderName;
    private static String cardNumber;

    public Card () {}

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    double credit (double something) {
        return something;
    }

    double debit (double amount){
        return amount;
    }

}
