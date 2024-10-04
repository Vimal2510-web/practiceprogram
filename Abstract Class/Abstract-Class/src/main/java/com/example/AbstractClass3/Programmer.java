package com.example.AbstractClass3;

public class Programmer extends Employee {

	
	public int overtimehours;
	public double RatePerHour;
	public Programmer(String name, double baseSalary, int overtimehours, double ratePerHour) {
		super(name, baseSalary);
		this.overtimehours = overtimehours;
		RatePerHour = ratePerHour;
	}
	@Override
	public double calculateSalary() {
		
		return baseSalary +(overtimehours * RatePerHour);
	}
	@Override
	public void displayInfo() {
		System.out.println("Programmer's Name : " + name);
		System.out.println("Base Salary : " + baseSalary);
		System.out.println("Overtime Hours : " + overtimehours);
		System.out.println("Rate Per Hour : " + RatePerHour);
		System.out.println("Total Salary : " + calculateSalary());
		
	}

}
