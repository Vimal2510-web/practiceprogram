package com.example.AbstractClass3;

public abstract class Employee {
	
	public String name;
	public double baseSalary;
	public Employee(String name, double baseSalary) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
	}		
	
	
     public abstract double calculateSalary();
     public abstract void displayInfo();
}
