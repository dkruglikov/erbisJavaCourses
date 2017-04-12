package com.erbis.java.cources.olga.lesson5;


public final class Increment {
	private static final int NUMBER5 = 231;
	private static final int NUMBER4 = 231;
	private static final int LENGTH6 = 6;
	private static final int LENGTH5 = 6;
	private static final int LENGTH4 = 10;
	private static final int LENGTH3 = 10;
	private static final int NUMBER3 = 3;
	private static final int NUMBER2 = 9;
	private static final int LENGTH2 = 10;
	private static final int LENGTH1 = 15;
	private static final int NUMBER1 = 10;
	private static final int NUMBER11 = 5;
	private static final int BYTE_CONST = 127;
	private Increment() {
	}
	public static void main(String[] args) {
		byte b = BYTE_CONST;
		b += 1;
		System.out.println(b);
		b -= NUMBER1;
		System.out.println(b);

		int i = NUMBER11;
		if (i % 2 == 0) {
			int j = i;
			System.out.println("i is even");
			System.out.println(j);
		} else {
			System.out.println("i is odd");
			// System.out.println(j); - is not compile
		}
		System.out.println("End");

		int a = NUMBER2;
		if (a % 2 == 0) {
			System.out.println("a is dividable by 2");
		} else if (a % NUMBER3 == 0) {
			System.out.println("a is dividable by 3"); // do not go further
		} else if (a < LENGTH1) {
			System.out.println("a is less then 15");
		} else {
			System.out.println("a is other...");
		}
		System.out.println("End2");

		for (int e = 0; e < LENGTH2; e++) {
			if (e % 2 == 0) {
				System.out.println(e);
			}
		}

		for (int e = 0; e < LENGTH3; e++) {
			if (e % 2 == 0) {
				System.out.println(e);
			}
		}

		for (int k = 0; k < LENGTH4; k += 2) {
			System.out.println(k);
		}

		int f = NUMBER4;
		for (int h = 0; h < LENGTH5; h++) {
			f /= 2;
			// if (f%2!=0) {
			// break;
			// }
			if (f % 2 == 0) {
				System.out.print("Step ");
				System.out.println(h);
				System.out.println(f);
			}
		}

		int p = NUMBER5;
		for (int l = 0; l < LENGTH6; l++) {
			p /= 2;
			if (p % 2 != 0) {
				continue;
			}
			System.out.print("Step ");
			System.out.println(l);
			System.out.println(p);
			
		}
	}

}
