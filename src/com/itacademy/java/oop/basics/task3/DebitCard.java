package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card implements Atm{

    public DebitCard() {
    }



    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);


    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void withdraw(double amount) throws NotEnoughCreditException {

        if ((getBalance()-amount)<0) {
            throw new NotEnoughCreditException("Your balance is too low! ");
        } else {
            System.out.println("Withdrawal completed! \n You still have "+(getBalance()-amount)+" dollars in your bank account.");
        }
    }
}
