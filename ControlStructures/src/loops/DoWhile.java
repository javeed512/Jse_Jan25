package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {


		
			boolean flag = true;
		
		  Scanner  sc = new Scanner(System.in);
		  
		  System.out.println("Enter your username");
		
		  String  username =  sc.next();
		  
		  
		  
		  do {
			  
			  	System.out.println("Welcome");
			  
			  	if(username.equals("javeed")) {
			  		
			  		System.out.println("Login success");
			  		
			  		break;
			  	}
			  	else {
			  		
			  		System.err.println("Invalid User");
			  		
			  		break;
			  	}
			  
			
		} while (flag);
		  
		  
		  
		  
		

	}

}
