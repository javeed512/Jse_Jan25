package com.object;

public class ObjDemo extends Object{

	public static void main(String[] args) {


				Object obj = new Object();
				
			
				
				
				Object obj2 = obj;
				
				
				new Object();
				
				System.out.println("getClass "+obj.getClass());
				System.out.println("hashcode "+obj.hashCode());
				
				
				System.out.println("obj hashcode using toString() "+obj.toString());
			
				System.out.println("obj2 hashcode using toString() "+obj2.toString());
				
		
					System.out.println("Are they equals "+obj.equals(obj2)); // compare refs or hashcodes

					
				Object  o1 =	new String("IPhone");
				
				
						String s1  = (String) o1;  // explicit type  casting
					
						System.out.println(s1);
					
	}

}
