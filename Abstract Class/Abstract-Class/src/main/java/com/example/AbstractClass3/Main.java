package com.example.AbstractClass3;

public class Main {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager("Parthiban", 125000, 15000);
		
		Programmer programmer = new Programmer ("Vimalraj", 26500,50,100);
		
		manager.displayInfo();
		
		programmer.displayInfo();
	}

}
