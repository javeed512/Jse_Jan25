package com.object;

public class WrapperDemo {

	public static void main(String[] args) {

		int x = 20;

		Integer I = Integer.valueOf(x);

		System.out.println(I.getClass());
		
		
		String str = "5000";
		
	  int  amount =	Integer.parseInt(str);
		
		System.out.println( amount + 100);
		
		Double  d  =  new Double(4.55);
		
		
		
	String s1 =   d.toString(); // any java object can be convert into string using toString()
		
			System.out.println(s1);  //  "4.55"
		

	}

}
