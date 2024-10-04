package com.example.AbstractClass1;

public class Circle {
	
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	double calculateArea() {
		
		return Math.PI * radius * radius;
	}
	
	double calculatePerimeter() {
		
		return 2 * Math.PI * radius;
	}

}
