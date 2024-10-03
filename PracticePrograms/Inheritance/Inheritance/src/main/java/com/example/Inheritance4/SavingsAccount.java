package com.example.Inheritance4;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        
        if (getBalance() - amount < 10000) {
            System.out.println("Minimum balance of Rs 10000 required!");
        } else {
            super.withdraw(amount);
        }
    }

}
