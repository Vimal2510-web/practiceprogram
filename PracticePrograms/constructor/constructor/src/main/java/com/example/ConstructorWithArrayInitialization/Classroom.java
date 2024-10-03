package com.example.ConstructorWithArrayInitialization;

public class Classroom {
	
	public String className;
	public String[] students;
	public Classroom(String className, String[] students) {

		this.className = className;
		this.students = students;
	}
	
	public void PrintClassroom() {
		
		System.out.println("Class Name : " + className);
		System.out.print("Student Name : ");
		
		for (String student : students) {
			System.out.print(student + " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String [] studentArray = {"Vimalraj", "Anbarasu","Kannan"};
		
		String [] studentArray2 = {"Kannan", "Vimalraj"};
		
		Classroom classroom = new Classroom("Science 101", studentArray);
		
		Classroom classroom1 = new Classroom("Tamil 102", studentArray2);
		
		classroom.PrintClassroom();
		classroom1.PrintClassroom();
		
		
		
	}
	

}
