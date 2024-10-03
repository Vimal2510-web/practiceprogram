package com.example.chainingconstructor;

public class Student {
	
	public int studentId;
	public String studentName;
	public String grade;
	
	public Student() {
		
		this(0,"Unknown","Unknown");
	}

	public Student(int studentId, String studentName , String grade) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	public static void main(String[] args) {
		
		Student Student1 = new Student();
		
		System.out.println("Student's ID : " + Student1.studentId);
		System.out.println("Student's Name : "+ Student1.studentName);
		System.out.println("Student's Grade : "+ Student1.grade);
		
        Student Student2 = new Student(101,"Vimalraj.V","B");
		
		System.out.println("Student's ID : " + Student2.studentId);
		System.out.println("Student's Name : "+ Student2.studentName);
		System.out.println("Student's Grade : "+ Student2.grade);
		
        Student Student3 = new Student();
		
		System.out.println("Student's ID : " + Student3.studentId);
		System.out.println("Student's Name : "+ Student3.studentName);
		System.out.println("Student's Grade : "+ Student3.grade);
		
		
		
	}
	
	

}
