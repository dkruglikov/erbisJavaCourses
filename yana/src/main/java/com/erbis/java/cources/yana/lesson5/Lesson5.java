package com.erbis.java.cources.yana.lesson5;

public class Lesson5 {
	public static void main(String[] args) {
		byte b = 127;
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b -= 10;
		System.out.println(b);
		b += 1;
		System.out.println(b);
		b -= 5;
		System.out.println(b);

		int i = 60;
		if (i % 2 == 0) {
			System.out.println("i dividable by 2");
		} else if (i % 3 == 0) {
			System.out.println("i dividable by 3");
		} else if (i < 15) {
			System.out.println("i less than 15");
		} else {
			System.out.println("i is other...");
		}

		System.out.println("END");

		for (int j = 0; j < 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

		int k = 231;
		for (int i1 = 0; i1 < 6; i1++) {
			k /= 2;

			// if (k % 2 != 0) {
			// break;
			// }

			if (k % 2 == 0) {
				System.out.print("Step ");
				System.out.println(i1);
				System.out.println(k);
			}
		}

		int k1 = 231;
		for (int i2 = 0; i2 < 6; i2++) {
			k1 /= 2;
			if (k1 % 2 != 0) {
				continue;
			}
			System.out.print("Step ");
			System.out.println(i2);
			System.out.println(k1);
		}
	}
}
