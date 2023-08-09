package com.alinazim.overload;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(123L, 1000.00);
        Account account2 = new Account(456L, 500.00);
        Account account3 = new Account(789L, 200.00);

        TransferService transferService = new TransferService();

        transferService.transfer(account1, account2, 100); // Same bank
        transferService.transfer(account1, account3, 100, 5); // Different bank
        transferService.transfer(account2, account3, 100, 5, 1.1); // International
    }
}