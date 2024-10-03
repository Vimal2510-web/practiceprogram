package com.example.Inheritance4;

public class Main {
	
	public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of 50000: Rs");
       
        BankAccount BA1234 = new BankAccount("BA1234", 50000);
        
        System.out.println("Deposit 100000 Rs into account BA1234: ");
        
        BA1234.deposit(100000);
        
        System.out.println("New balance after depositing 100000 Rs: Rs " + BA1234.getBalance());

        System.out.println("Withdraw 60000 Rs from account BA1234:");
        
        BA1234.withdraw(60000);
        
        System.out.println("New balance after withdrawing 60000: Rs" + BA1234.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of 45000: Rs ");
        
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 45000);

        SA1234.withdraw(30000);
        
        System.out.println("Balance after trying to withdraw Rs 30000: Rs " + SA1234.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of 30000: Rs");
        
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 30000);
        System.out.println("Try to withdraw Rs 25000 from SA1000!");
        
        SA1000.withdraw(25000);
        
        System.out.println("Balance after trying to withdraw 25000: Rs " + SA1000.getBalance());
    }

}
