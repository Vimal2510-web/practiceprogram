package com.example.AbstractClass2;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	
	}
	public void  deposit(double amount) {
		
		setBalance(getBalance() + amount);
		System.out.println("Deposit of Rs. " + amount + "is succesful " + "and the balance is : Rs. " + getBalance());
}

	public void withdraw(double amount) {
		
		if (getBalance() >= amount) {
	
		setBalance(getBalance()-amount);
		
		System.out.println("Withdrawl of Rs. " + amount + "is successful " + "and the balance is : Rs. " + getBalance());
		
	}
		else {
			
			System.out.println("Insuficient Banalce and the withdrawl failed.");
		}
		
		System.out.println();
	}

}
