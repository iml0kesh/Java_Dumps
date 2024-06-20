package com.w3resource.javaInheritance;

public class Exercise05 {
    public static void main(String[] args) {

    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double Amount) {
        balance += Amount;
    }

    public void withDraw(double Amount) {
        if(balance >= Amount){
            balance -= Amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withDraw(double Amount) {
        if(getBalance() - Amount < 100){
            System.out.println("Low balance");
        } else {
            super.withDraw(Amount);
        }
    }
}