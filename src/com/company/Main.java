package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount b1, b2;

        b1 = new BankAccount("John", 34534534, 50000);

        b1.setFullName("John");

        System.out.println(b1.getFullName() + " has a balance of " + b1.balance);

        b1.withdraw(60000);

    }

}

//To move a line up, do Command Shift and Up