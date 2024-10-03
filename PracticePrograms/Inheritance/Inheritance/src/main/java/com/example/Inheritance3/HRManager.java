package com.example.Inheritance3;

public class HRManager extends Employee {
	
	public HRManager(int salary) {
        
        super(salary);
    }

    public void work() {
        
        System.out.println("\nTrainee");
    }

    public void addEmployee() {
        
        System.out.println("\nAdding new employee");
    }

}
