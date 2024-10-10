package com.example.String;

public class StringObject {
	
	public static void main(String[] args) {
		
		char[] arr_num = new char[] {'1','2','3','4','5','6','7'}; // character array with data 
		
		String str = String.copyValueOf(arr_num,1,4);
		
		System.out.println("The numbers are " + str);
	}

}
