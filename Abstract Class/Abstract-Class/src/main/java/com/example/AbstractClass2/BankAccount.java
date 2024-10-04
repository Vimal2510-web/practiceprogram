package com.example.AbstractClass2;

public abstract class BankAccount {
	
	public String AccountNumber;
	public double balance;
	public BankAccount(String accountNumber, double balance) {
		super();
		AccountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
