package com.company;

/**
 * Created by ridita on 9/19/17.
 */
public class BankAccount {

    //flesh out the current methods
    //add deposit method
    //add pin number authentication system
    public String fullName;
    public int account;  //only visible in the class in which it is declared
    public int balance;

    public BankAccount(String fullName, int account, int balance){ //First method that gets called when the class is created
        this.fullName = fullName;
        this.account = account;
        this.balance = balance;
    }

    public void withdraw(int amount){  //How much do you want to withdraw?
        if(amount <= balance){
            balance = balance - amount;
        }

        else{
            System.out.println("Sorry, there isn't enough in the account");
        }
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String name){  //I require the person to give me a name of type String
        fullName = name;
    }

}
