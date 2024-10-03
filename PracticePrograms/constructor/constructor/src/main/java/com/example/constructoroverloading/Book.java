package com.example.constructoroverloading;

public class Book {
	
	public String title;
	public String author;
	public double price;
	public Book() {
		super();
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.00;
	}
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		this.price = 0.00;
	}
	public Book(String title, String author, double price) {
		
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		Book Book1 = new Book ();
		System.out.println("Book Title : " + Book1.title);
		System.out.println("Book's Author : " + Book1.author);
		System.out.println("Book's Price : " + Book1.price);
		
		Book Book2 = new Book ("War and Peace","Leo Tolstoy");
		System.out.println("Book Title : " + Book2.title);
		System.out.println("Book's Author : " + Book2.author);
		System.out.println("Book's Price : " + Book2.price);
		
		Book Book3 = new Book ("The Merchant of Venice","William Shakespeare",2399.00);
		System.out.println("Book Title : " + Book3.title);
		System.out.println("Book's Author : " + Book3.author);
		System.out.println("Book's Price : " + Book3.price);
		
	}
	
	

}
