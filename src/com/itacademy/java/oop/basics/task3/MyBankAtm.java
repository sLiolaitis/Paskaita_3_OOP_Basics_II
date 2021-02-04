package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm{

    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) throws InsuficientAtmFundsException {
        if (amount<0){
            throw new InsuficientAtmFundsException("Invalid request...");
        }
        else if ((this.balance-amount)<0) {
            throw new InsuficientAtmFundsException("Not enough cash in ATM!!!");
        } else {
            System.out.println("ATM of Swedbank is able to fulfill your request");
        }
    }
}
