package com.example.CollectionList;

//Printing ArrayList using position of element

import java.util.ArrayList;

public class PrintAllElements {
	
	public static void main(String[] args) {
		  ArrayList <String> colour = new ArrayList <String> ();
		  colour.add("Red");
		  colour.add("Green");
		  colour.add("Black");
		  colour.add("White");
		  colour.add("Pink");
		  System.out.println("\nOriginal array list: " + colour);
		  
		  System.out.println("\nPrint using index of an element: ");
		  
		  int no_of_elements = colour.size();
		  
		  for (int index = 2; index < no_of_elements; index++)
			  
		   System.out.println(colour.get(index));

}
}
