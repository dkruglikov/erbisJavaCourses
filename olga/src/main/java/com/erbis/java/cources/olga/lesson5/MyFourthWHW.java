package com.erbis.java.cources.olga.lesson5;

public final class MyFourthWHW {
	private static final int NINE = 9;
	private static final int EIGHT = 8;
	private static final int SEVEN = 7;
	private static final int SIX = 6;
	private static final int FIVE = 5;
	private static final int FOUR = 4;
	private static final int TREE = 3;
	private static final int NUMBER1 = 16;
	private static final int LENGTH3 = 8000;
	private static final int LENGTH1 = 10;
	private MyFourthWHW() {
	}
	public static void main(String[] args) {
		// Task1
		for (int i = 0; i < LENGTH1; i++) {
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
			case TREE:
				System.out.println("Three");
				break;
			case FOUR:
				System.out.println("Four");
				break;
			case FIVE:
				System.out.println("Five");
				break;
			case SIX:
				System.out.println("Six");
				break;
			case SEVEN:
				System.out.println("Seven");
				break;
			case EIGHT:
				System.out.println("Eight");
				break;
			case NINE:
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
		while (j < LENGTH3) {
			if (j % NUMBER1 == 0) {
				continue;
			}
			System.out.println(j);
			j *= 2;
		}

	}
}