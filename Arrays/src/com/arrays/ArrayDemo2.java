package com.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int ar[] = new int[4];

		System.out.println(ar);
		System.out.println("Size " + ar.length);

		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);

		}

	}

}
