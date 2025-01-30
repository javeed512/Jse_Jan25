package com.java.basics;

public class Student extends Object { // Inheritance or  IS-A Relationship
	
	private int sid;          // instance vars  or properties
	private String sname;
	
	
	
	
	
	@Override
	public String toString() {  // overriding take place between parent and child class
		
		return "This is Student Object";
		
	}
	
	 static void m1() {  // method overloading
		  
	  }
	  void m1(String s) {
		  
		  
	  }
	
	public Student() {  // default constructor
		super();
		
		
		
		System.out.println("Student() constructor is called.."+super.getClass());
		
	}
	
	// constructor overloading
	public Student(int sid, String sname) {  // parameter constructor creates obj and initialize instance vars
		
		
			//this(); // Student();
			this.sid  = sid;
			this.sname = sname;
		
	}
	

	public static void main(String[] args) {
		
		
		

		Student s1 = new Student();
		// Object class toString() print hashcode if Student dont have toString()
		System.out.println(s1.toString());  // Student class toString() is called
		
		System.out.println(s1.getClass());
		
		
		String  str  = new String("hello");
		
		System.out.println(str.toString());  // str.toString();
		
		
		
		Student  student1 =   	new Student(101, "rohit");
		
		Student student2  =  new Student(102,"tom");
		
		
		

	}

}
