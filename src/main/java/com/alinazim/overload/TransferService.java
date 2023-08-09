package com.alinazim.overload;

public class TransferService {

    // Same bank transfer
    public void transfer(Account from, Account to, double amount) {
        // Transfer logic
        System.out.println("Transferred " + amount + " from account " + from.getId() + " to account " + to.getId() + " within the same bank.");
    }

    // Different bank transfer with an extra fee
    public void transfer(Account from, Account to, double amount, double fee) {
        // Transfer logic
        double totalAmount = amount + fee;
        System.out.println("Transferred " + totalAmount + " (including fee) from account " + from.getId() + " to account " + to.getId() + " to a different bank.");
    }

    // International transfer with an extra fee and exchange rate
    public void transfer(Account from, Account to, double amount, double fee, double exchangeRate) {
        // Transfer logic
        double totalAmount = (amount + fee) * exchangeRate;
        System.out.println("Transferred " + totalAmount + " (including fee and exchange rate) from account " +
                from.getId() + " to account " + to.getId() + " internationally.");
    }
}