package com.example.lib.chapter6;

public class Ex4_BankAccount {

    private String user;
    private double balance;

    public Ex4_BankAccount(String user, double balance) {
        this.user = user;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
          balance = balance + amount;

    }
    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void printBalance(){
        System.out.println(balance);
    }


}
