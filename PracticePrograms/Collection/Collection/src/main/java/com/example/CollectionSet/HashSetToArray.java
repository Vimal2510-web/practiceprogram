package com.example.CollectionSet;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
        
    HashSet<String> hash_set = new HashSet<String>();
  
         hash_set.add("Red");
         hash_set.add("Green");
         hash_set.add("Black");
         hash_set.add("White");
         hash_set.add("Pink");
         hash_set.add("Yellow");
     System.out.println("Original Hash Set: " + hash_set);
     
     String[] new_array = new String[hash_set.size()];
     hash_set.toArray(new_array);

    
    System.out.println("Array elements: ");
     for(String element : new_array){
       System.out.println(element);
    }
  }
}


