package com.example.lib.chapter6;

public class Ex4_BankRunner {

    public static void main(String[] args)
    {
        Ex4_BankAccount account1 = new Ex4_BankAccount("badar", 50);
        Ex4_BankAccount account2 = new Ex4_BankAccount("muhammad", 80);

        account1.deposit(158);
        account1.withdraw(50);

        account2.deposit(15);
        account2.withdraw(50);


        account1.printBalance();
        account2.printBalance();
    }
}
