package com.example.Encapsulation1;

public class Main {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Vimalraj. V");
		person.setAge(22);
		person.setCountry("India");
		
		String name = person.getName();
		int age = person.getAge();
		String country = person.getCountry();
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Country : " + country);
	}

}
