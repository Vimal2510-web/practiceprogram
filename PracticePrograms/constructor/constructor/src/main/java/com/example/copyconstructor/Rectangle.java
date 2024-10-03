package com.example.copyconstructor;

public class Rectangle {
	
	public double length;
	public double width;
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
    public Rectangle(Rectangle rectangle) {
		
		this.length = rectangle.length;
		this.width = rectangle.width;
	}
    
    public static void main(String[] args) {
    	
    	Rectangle rect1 = new Rectangle (12.5,10.2);
    	
    	System.out.println("Rectangle's Length : " + rect1.length);
    	System.out.println("Rectangle's Width : " + rect1.width);
    	
    	Rectangle rect2 = new Rectangle (11.1,15.1);
    	
    	System.out.println("Rectangle's Length : " + rect2.length);
    	System.out.println("Rectangle's Width : " + rect2.width);
		
	}
	
	
	

}
