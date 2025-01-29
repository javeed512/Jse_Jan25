package com.oracle.variables;

public class Student {
	
	static  int sid;  // jvm -->  0
	 static  String sname;  // jvm -->   null
	  
	  boolean isValid; // jvm --> false
	   
	  double fee;    // jvm --> 0.0
	  
	  public static void main(String[] args) {
		
		  int x ;
		  
		  String y;
		  
		  Student s1  = new Student();
		   
		  	s1.sid = 101;
		  	s1.sname = "tom";
		  
		
			System.out.println("Sid s1 " + s1.sid);
		  
		  System.out.println("SName s1 "+ s1.sname);
		  
		  System.out.println("IsValid  "+ s1.isValid);
		  
		  System.out.println("Fee "+s1.fee);
		  
		  
		  
		  Student s2  = new Student();
		  
		  
		  
		  System.out.println("Sid s2 "+s2.sid);
		  System.out.println("Sname s2 "+s2.sname);
		  System.out.println(s2.fee);
		  
		  
		  System.out.println("Sid Student "+Student.sid);
		  System.out.println("Sname Student "+Student.sname);
	  
	  }
	  
	  
	

}
