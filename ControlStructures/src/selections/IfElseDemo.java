package selections;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {


		Scanner  sc =  new Scanner(System.in);
		
			 System.out.println("Enter age ?");  // "20"
		 
			 		int age =	sc.nextInt();
			 		
			 	if(age >= 18) {
			 		
			 		System.out.println("You are Eligible for Voting");
			 		
			 	}	
			 	else {
			 		
			 		System.err.println("Sorry not eligible");
			 		
			 	}
		
		
	}

}
