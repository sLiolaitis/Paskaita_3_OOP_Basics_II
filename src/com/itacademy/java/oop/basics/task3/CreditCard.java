package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card implements Atm {

    private double interest;
    private double credit;

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void withdraw(double amount) throws NotEnoughCreditException {
        double restMoney = getBalance() - (((amount / 100) * this.interest) + amount);
        if (restMoney < credit) {
            throw new NotEnoughCreditException("Your balance is not allowed to be smaller than your credit!");
        } else if ((getBalance() - amount) < 0) {
            throw new NotEnoughCreditException("Your balance is too low! ");
        } else {
            System.out.println("Withdrawal completed! \n You still have " + restMoney + " dollars in your bank account.");
        }
    }
}
