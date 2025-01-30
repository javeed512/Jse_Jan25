package selections;
import java.util.Scanner;
public class SwitchNewExp {

	public static void main(String[] args) {
		

	     Scanner  sc = new Scanner(System.in);
	     
	     System.out.println("Enter Month to find No. of days");
	     
	     		int month =	  sc.nextInt();
		
	     		switch (month) {
				
	     		case  1,3,5,7,8,10,12  -> System.out.println("It has 31 days");
				
	     		case 4,6,9,11  -> System.out.println("It has 30 days");
	     		
	     		case  2 ->  System.out.println("It has either 28 or 29 days");
	     		   
	     		default -> System.out.println("Invalid month");
	     		
	     		
	     		
				}
	     		
		
	}

}
