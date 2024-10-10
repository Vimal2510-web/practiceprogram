package com.example.TrainingDay1;

// To print minimum value

public class MinNum {
	
	static int findMin(int a, int b, int c, int d, int e) {
		 int min = a;
		 
		 if (b < min)
			 min = b;
		 if (c < min )
			 min= c;
		 if (d < min )
			 min= d;
		 if (e < min )
			 min= e;
			 return min;
		 
	}
	
	public static void main(String[] args) {
		
		int min = findMin(10,20,14,7,2);
		System.out.println("The minimum number is : " + min);
	}

}
