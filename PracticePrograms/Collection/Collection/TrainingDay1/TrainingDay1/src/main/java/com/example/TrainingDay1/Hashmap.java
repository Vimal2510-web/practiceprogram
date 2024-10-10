package com.example.TrainingDay1;

import java.util.HashMap;

public class Hashmap {
	
public static void main(String[] args) {
		
		HashMap <String, Integer > map = new HashMap<>();
		
		map.put("Banglore",10);
		map.put("Chennai", 20);
		map.put("Hyderabad", 30);
		
		System.out.println("Size of Map is : " + map.size());
		
		if (map.containsKey("Banglore")) {
			
			Integer a = map.get("Banglore");
			System.out.println("The value of key is : " + a);
			
		}
		
		if (map.isEmpty()) {
			
			System.out.println("map is empty");
		}
		
		else {
			System.out.println(map);
		}
		
		
	}

}
