package com.oracle.pojo;

public class Test {

	public static void main(String[] args) {

		Student student1 = new Student(101, "tom", 2000);
		
			student1.setFee(5000);
	
			
			System.out.println(student1); // student1.toString()

		System.out.println(student1.getSid() + " " + student1.getSname() + " " + student1.getFee());

		// Student student2 = new Student(0,"smith",0.0);

		Student student2 = new Student();

		student2.setSname("smith");
		student2.setFee(1500);
		
		System.out.println(student2.getSid() + " " + student2.getSname() + " " + student2.getFee());

		
				StudentRecord  s1Record = new StudentRecord(105, "javeed", 3000);
				
				System.out.println(s1Record);
		
		
	}

}
