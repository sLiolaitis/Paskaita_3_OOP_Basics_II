package com.itacademy.java.oop.basics.task3;

public class AtmApplication {


    public static void main(String[] args) {


        CreditCard justinasCard = new CreditCard(3500, "Justinas Justinavicius", "9520 3206 8478 0547",
                3.0, 300);
        final DebitCard sherloksCard = new DebitCard(300, "Sherlok Holmes", "0235 4578 1471 0258");
        MyBankAtm swedBank = new MyBankAtm(700);
        AtmApplication atmApplication = new AtmApplication();

        atmApplication.withdrawal(swedBank, justinasCard, 0);
        System.out.println("--------------------");
        atmApplication.withdrawal(swedBank, sherloksCard, 400);


    }

    public void withdrawal(MyBankAtm myBank, CreditCard creditCard, double amount) {
        boolean flag = true;
        try {
            myBank.withdraw(amount);
        } catch (InsuficientAtmFundsException a) {
            System.out.println(a.getMessage());
            flag=false;
        }

        if (flag) {

            try {
                creditCard.withdraw(amount);
            } catch (NotEnoughCreditException b) {
                System.out.println(b.getMessage());

            }
        }


    }

    public void withdrawal(MyBankAtm myBank, DebitCard debitCard, double amount) {
        boolean flag = true;
        try {
            myBank.withdraw(amount);
        } catch (InsuficientAtmFundsException a) {
            System.out.println(a.getMessage());
            flag=false;
        }


        if (flag) {

            try {
                debitCard.withdraw(amount);
            } catch (NotEnoughCreditException b) {
                System.out.println(b.getMessage());

            }
        }


    }


}
