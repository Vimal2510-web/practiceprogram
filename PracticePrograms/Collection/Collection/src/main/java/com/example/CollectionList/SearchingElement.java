package com.example.CollectionList;

import java.util.ArrayList;
import java.util.List;

public class SearchingElement {
		
	public static void main(String[] args) {
		
	
		List<String> colour = new ArrayList<String>();
		
		colour.add("Red");
		colour.add("Blue");
		colour.add("Orange");
		colour.add("Green");
		colour.add("White");
		colour.add("Black");
		colour.add(4,"Violet");
		colour.add(0,"Yellow");
		
		if(colour.contains("Lavander")) {
		
			System.out.println("Black");
		
		System.out.println("Colour found");
		
	}
		else {
			System.out.println("Colour not found");
			System.out.println("Enter the valid colour");
		}

}
}
