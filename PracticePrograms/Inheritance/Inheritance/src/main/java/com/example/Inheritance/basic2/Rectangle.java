package com.example.Inheritance.basic2;

public class Rectangle extends Shape {
	
	public double length;
	public double width;
	public Rectangle(double length, double width) {


		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		
		return length*width;
	}
	
	

}
