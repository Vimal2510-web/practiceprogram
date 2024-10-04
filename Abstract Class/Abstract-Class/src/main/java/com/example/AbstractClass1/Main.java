package com.example.AbstractClass1;

public class Main {
	
	public static void main(String[] args) {
		
		
		double r = 5.3;
		
		Circle circle = new Circle(r);
		
		double ts1= 13.2, ts2= 11.3, ts3 = 9.5;
		
		Triangle triangle = new Triangle(ts1,ts2,ts3);
		
		System.out.println("Radius of the Circle : " + r);
		System.out.println("Area of the circle : " + circle.calculateArea());
		System.out.println("Perimeter of circle : " + circle.calculatePerimeter());
		
		System.out.println("The leangth of the triangels : " + ts1 + ',' + ts2 + ',' + ts3);
		System.out.println("Area of the Triangle : " + triangle.calculateArea());
		System.out.println("Perimeter of the triangle : " + triangle.calculatePerimeter());
	}

}
