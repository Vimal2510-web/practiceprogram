package com.example.Inheritance3;

public class Main {
	
	 public static void main(String[] args) {
	        
	        Employee employee = new Employee(26000);

	        HRManager manager = new HRManager(70000);

	        employee.work();

	        System.out.println("Employee salary: " + employee.getSalary());

	        manager.work();

	        System.out.println("Manager salary: " + manager.getSalary());

	        manager.addEmployee();
	    }

}
