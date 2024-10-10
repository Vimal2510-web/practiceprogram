package com.example.TrainingDay1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {
	public static void main(String args[]) {
		List a = new ArrayList<>();
		a.add("Vimalraj");
		a.add("Aadhavan");
		a.add("Rajesh");
		System.out.println("     List is    ");
		Iterator i = a.iterator();
		while (i.hasNext()){
			
			System.out.println("Name : " + i.next());
		}
		System.out.println("Size is : " + a.size());
		System.out.println("Value at given position is : " + a.get(2));
		System.out.println("Removing using index : " + a.remove(1));
	}

}
