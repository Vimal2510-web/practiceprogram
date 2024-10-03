package com.example.Inheritance4;

public class BankAccount {
	
	public String accountNumber;
    public double balance;

        public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
       
        balance += amount;
    }

    public void withdraw(double amount) {
        
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

}
