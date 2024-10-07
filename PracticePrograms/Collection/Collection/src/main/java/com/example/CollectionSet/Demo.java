package com.example.CollectionSet;

//import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		
		Set<Integer> nums= new TreeSet<Integer>();
		
		nums.add(6);
		nums.add(4);
		nums.add(5);
		nums.add(2);
		nums.add(0);
		nums.add(6);
		
//		Iterator <Integer> values = nums.iterator();
//		
//		while(values.hasNext())
//		System.out.println(values.next());
		
		for (int n : nums) {
			System.out.println(n);
		}
		
	}

}
