package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name");

		String name = sc.next(); // tom --> t , o , m

		int i = 0;

		while (i < name.length()) {

			System.out.println(name.charAt(i));

			i++;

		}

	}

}
