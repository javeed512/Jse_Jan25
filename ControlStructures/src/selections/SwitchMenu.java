package selections;

import java.util.Scanner;

public class SwitchMenu {

	public static void main(String[] args) {

		System.out.println("Welcome to ATM");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4.  Logout/Exit");

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
				System.out.println("You can Deposit");
			
			break;
		case 2:
				
			System.out.println("You can Withdraw");

			break;
		case 3:

			System.out.println("You can Check balance");
			
			break;
			
		case 4:
			System.out.println("Thank you visit again");
				System.exit(1);
			
			break;	

		default:
			
				System.err.println("Invalid Option");
			
			break;
		}

	}

}
