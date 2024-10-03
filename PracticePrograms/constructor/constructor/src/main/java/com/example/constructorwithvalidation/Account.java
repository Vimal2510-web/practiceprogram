package com.example.constructorwithvalidation;

public class Account {
	
	public String accountNumber;
	public double balance;
	public Account(String accountNumber, double balance) {
		
//		if (accountNumber == null || accountNumber .isEmpty()) {
//			
//			System.err.println("Error: account number should not be Empty");
//			return;
//		}
//		
//		if (balance<0) {
//			
//			System.err.println("Error: balance should not be negative");
//			return;
//		}
//		
//		this.accountNumber = accountNumber;
//		this.balance = balance;
		
		this.accountNumber = (accountNumber == null || accountNumber.isEmpty()) ?
				"Error: account number should not be empty": accountNumber;
			
		if (balance<0) {
			
			System.err.println("Error: balance should not be negative");
			return;
		}
		
		this.balance= balance;	
	}
	
	public static void main(String[] args) {
		
		Account Account1 = new Account("123456789",2567.35);
		
		System.out.println("Account 1 Number : " + Account1.accountNumber);
		System.out.println("Available Balance : " + Account1.balance);
		
        Account Account2 = new Account("",2567.35);
		
		System.out.println("Account 2 Number : " + Account2.accountNumber);
		System.out.println("Available Balance : " + Account2.balance);
		
        Account Account3 = new Account("123456789",-2567.35);
		
		System.out.println("Account 3 Number : " + Account3.accountNumber);
		System.out.println("Available Balance : " + Account3.balance);
	}
	
}
