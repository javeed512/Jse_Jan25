package com.arrays;

public class ArrayDemo {

	public static void main(String[] args) {


		 String    ar[] = {"apple","mango","banana","orange"};
		 
		 System.out.println(ar);
		// it gives Array Index out of bound Exception 
		// ar[5]= "kiwi";
		
		 
		 for (int i = 0; i < ar.length; i++) {
			 
			 System.out.println(ar[i]);
			
		}
		 
		 System.out.println("For Each Loop");
		 
		 for (String s1 : ar) {
			 
			 System.out.println(s1);
			
		}
		 

	}

}
