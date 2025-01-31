package com.arrays;

public class Array2D {

	public static void main(String[] args) {


			int  ar[][] = new int[3][2];
		
			System.out.println(ar);
			
			System.out.println(ar[0]);
			
			System.out.println(ar[0][0]);
			
			System.out.println(ar[2][0]);
			
			ar[1][1] = 99;
			
			
			int ar1[] = {5,10,15,20};
			
			  setArr(ar1);
			  
			  setArr(1,2,3);
			  
			  setArr();

	}
	
	
	public static void    setArr( int  ...a1) {  // var arguments
		
		  for (int i = 0; i < a1.length; i++) {
		
			  	System.out.println(a1[i]);
		}
		
	}

}
