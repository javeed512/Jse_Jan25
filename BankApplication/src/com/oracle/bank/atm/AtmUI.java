package com.oracle.bank.atm;

import java.util.Scanner;

/*
 * 
 * @author: Priya  UI Developer
 * 
 */
public class AtmUI {

	public static void main(String[] args) {

		boolean flag = true;

		IBank bank = Util.getObject(); // abstraction

		while (flag) {
			System.out.println("******WELCOME TO ATM*******");
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAW");
			System.out.println("3. EXIT");

			Scanner scanner = new Scanner(System.in); // HAS A Relationship

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				// deposit();

				bank.deposit();

				break;

			case 2:
				// withdraw();

				bank.withdraw();

				break;

			case 3:

				System.out.println("Thank you visit again..");

				flag = false;

				break;

			default:
				break;
			}

		}

	}

}
