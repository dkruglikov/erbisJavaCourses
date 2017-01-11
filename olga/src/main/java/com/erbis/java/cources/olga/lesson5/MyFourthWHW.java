package com.erbis.java.cources.olga.lesson5;

public class MyFourthWHW {

	public static void main(String[] args) {
		// Task1
		for (int i = 0; i < 10; i++) {
			switch (i) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Number is not in range [0,9]");
				break;
			}

		}

		System.out.println();

		// Task 2
		int j = 1;
		while (j < 8000) {				
			if (j % 16 == 0) {
				continue;
			}
			System.out.println(j);
			j *= 2;
		}

	}
}