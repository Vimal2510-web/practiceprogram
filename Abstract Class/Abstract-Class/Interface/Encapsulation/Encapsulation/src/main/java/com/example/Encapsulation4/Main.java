package com.example.Encapsulation4;

public class Main {
	
	public static void main(String[] args) {
        
        Book book = new Book();

        book.setTitle("The Merchant Of Venice");
        book.setAuthor("Shakesphere");
        book.setPrice(350.0);

        book.applyDiscount(10);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: Rs." + book.getPrice());
    }
}
