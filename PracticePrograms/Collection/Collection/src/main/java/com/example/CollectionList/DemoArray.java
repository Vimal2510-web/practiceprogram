package com.example.CollectionList;

import java.util.ArrayList;
import java.util.Collection;


public class DemoArray {
	
	public static void main(String[] args) {
		
		
		Collection <Integer>nums = new ArrayList<Integer>();
		
		nums.add(8);
		nums.add(6);
		nums.add(7);
		nums.add(2);
		nums.add(16);
		
		for (int n : nums) {
			System.out.println(n*3);
		}
		
		
	}

}
