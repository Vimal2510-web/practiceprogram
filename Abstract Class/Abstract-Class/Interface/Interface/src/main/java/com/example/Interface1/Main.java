package com.example.Interface1;

public class Main {
	
	public static void main(String[] args) {
	
	Flyable[] flyables = { new AirPlane(), new Helicopter(), new SpaceCraft()};
	
	for (Flyable obj : flyables) {
		
		obj.fly_obj();
	}
}
}
