package com.alinazim;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345678", 5000.0);

        // Printing account information
        System.out.println(account1);

        // Making a deposit
        account1.deposit(2000.0);
        System.out.println("After deposit: " + account1);

        // Making a withdrawal
        account1.withdraw(1500.0);
        System.out.println("After withdrawal: " + account1);
    }

}