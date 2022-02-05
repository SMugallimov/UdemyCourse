package com.company.homework5;

public class AccountLauncher {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Bank account: ", 123);
        System.out.println(bankAccount.accountName + " " + bankAccount.accountId + " " + bankAccount.accountReplenishment(200));
        System.out.println(bankAccount.accountName + " " + bankAccount.accountId + " " + bankAccount.accountWithdrawal(100));
    }
}
