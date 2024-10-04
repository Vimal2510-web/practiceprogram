package com.example.Encapsulation3;

public class Main {
	
	public static void main(String[] args) {
        
        Car car = new Car();

        car.setCompany_name("Mahindra & Mahindra");
        car.setModel_name1("XUV 700");
        car.setYear(2009);
        car.setMileage("14");
        
        String company_name = car.getCompany_name();
        String model_name = car.getModel_name();
        int year = car.getYear();
        double mileage = car.getMileage();

        System.out.println("Company Name: " + company_name);
        System.out.println("Model Name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }

}
