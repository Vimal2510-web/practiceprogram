package com.example.paramaterizedconstructor;

public class Dog {
	
	public String name;
	public String color;
	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
public static void main(String[] args) {
	
	Dog myDog = new Dog( "Alex","Brown");
	
	System.out.println("Dog's Name : " + myDog.name);
	System.out.println("Dog's Color : " + myDog.color);
}
}
