package com.example.Encapsulation2;

public class Main {
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		
		employee.setEmployee_id(111);
		employee.setEmployee_name("Vimalraj");
		employee.setEmployee_salary(26400);
		
		
		int employee_id = employee.getEmployee_id();
		String employee_name = employee.getEmployee_name();
		double employee_salary = employee.getEmployee_salary();
		
		System.out.println("Employee Id : " + employee_id);
		System.out.println("Employee Name : " + employee_name);
		System.out.println("Employee Salary : "+ employee_salary);
	}

}
