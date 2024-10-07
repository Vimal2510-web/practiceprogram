package com.example.CollectionSet;

import java.util.HashSet;

public class EmptyHash {
	
	public static void main(String[] args) {
        
    HashSet<String> hash_set = new HashSet<String>();
  
    hash_set.add("Red");
    hash_set.add("Green");
    hash_set.add("Black");
    hash_set.add("White");
    hash_set.add("Pink");
    hash_set.add("Yellow");
   System.out.println("Original Hash Set: " + hash_set);
  
   hash_set.removeAll(hash_set);
   System.out.println("Hash Set after removing all the elements "+hash_set);   
  }
}


