package com.example.String;

public class SwapNum {
	
	public static void main(String[] args) {
		
		int a=15;
		int b=10;
		
		System.out.println("a is " + a + " b is " +  b);
		
		a= a + b ;
		b=a - b ;
		a=a - b ;
		
		System.out.println(" After swapping : " + "a is " + a + " b is "+ b);
	}

}
