package com.example.ConstructorWithDefaultValues;

public class Car {
	
	public String make;
	public String model;
	public int year;
	public Car(String make, String model, int year) {
		
		
		
		this.make = (make == null || make.isEmpty() ? "Unknown Make" :make);
		this.model = (model == null || model.isEmpty() ? "Unknown Model" : model);
		this.year = (year<=0) ? 2000 : year ;
	}
	
	public static void main(String[] args) {
		
		Car Car1 = new Car("Mahindra & Mahindra","XUV 700",2023);
		
		System.out.println("Car's Make : " + Car1.make);
		System.out.println("Car's Model : " + Car1.model);
		System.out.println("Launched year : " + Car1.year);
		
		
		Car Car2 = new Car("","",2020);
		System.out.println("Car's Make : " + Car2.make);
		System.out.println("Car's Model : " + Car2.model);
		System.out.println("Launched year : " + Car2.year);
		
		
		Car Car3 = new Car("Tata","Indica",-2020);
		System.out.println("Car's Make : " + Car3.make);
		System.out.println("Car's Model : " + Car3.model);
		System.out.println("Launched year : " + Car3.year);
	
	
	
	
	
	}
	
	

}
