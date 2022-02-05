package com.company.homework5;

public class BankAccount {
    String accountName;
    int accountId;
    double amount = 100000;

    public BankAccount(String accountName, int accountId){
        this.accountName = accountName;
        this.accountId = accountId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName(){
        return accountName;
    }

    public int getAccountId() {
        return accountId;
    }

    public double accountReplenishment(double value){

        return amount += value;
    }

    public double accountWithdrawal(double value){

        return amount -= value;
    }
}
