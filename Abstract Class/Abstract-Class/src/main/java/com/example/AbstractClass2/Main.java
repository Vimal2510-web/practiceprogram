package com.example.AbstractClass2;

public class Main {
	
	public static void main(String[] args) {
		
		double Ibalance, Wamount, Damount;
		
		Ibalance = 2500;
		SavingsAccount savingsAccount = new SavingsAccount("HDFC001", Ibalance);
		
		System.out.println("Initial balance is : Rs. " + Ibalance);
		
		
		Damount = 130;
		savingsAccount.deposit(Damount);
		
		Wamount = 1486;
		savingsAccount.withdraw(Wamount);
		
	    Ibalance = 4529;
	    
	    CurrentAccount currentAccount = new CurrentAccount("HDFC002",Ibalance);
	    
	   System.out.println("Initial balance is : Rs. " + Ibalance);
		
		Damount = 673;
		currentAccount.deposit(Damount);
		
		Wamount = 634;
		currentAccount.withdraw(Wamount);

	}

}
