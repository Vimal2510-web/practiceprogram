package com.example.Inheritance5;

public class Main {
	
public static void main(String[] args) {
       
        double r = 8.26;
        
        Circle circle1 = new Circle(r);
        
        System.out.println("Radius of the circle=" + r);
        
        System.out.println("Perimeter: " + circle1.getPerimeter());
        
        System.out.println("Area: " + circle1.getArea());
        
        r = 3.23;

        Circle circle2 = new Circle(r);
        
        System.out.println("Radius of the circle = " + r);
        
        System.out.println("Perimeter: " + circle2.getPerimeter());
        
        System.out.println("Area: " + circle2.getArea());
    }

}
