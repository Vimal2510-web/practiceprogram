package com.example.CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingElements {

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
		
		System.out.println("List before sort : " + colour);
		
		Collections.sort(colour);
		
		System.out.println("List after sort : " + colour);
}
}
