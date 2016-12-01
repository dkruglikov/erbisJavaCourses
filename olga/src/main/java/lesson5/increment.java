package lesson5;

public class increment {
	public static void main(String[] args) {
		byte b = 127;
		b += 1;
		System.out.println(b);
		b -= 5;
		System.out.println(b);

		int i = 10;
		if (i % 2 == 0) {
			int j = i;
			System.out.println("i is even");
			System.out.println(j);
		} else {
			System.out.println("i is odd");
			// System.out.println(j); - is not compile
		}
		System.out.println("End");

		int a = 9;
		if (a % 2 == 0) {
			System.out.println("a is dividable by 2");
		} else if (a % 3 == 0) {
			System.out.println("a is dividable by 3");// дальше не идем
		} else if (a < 15) {
			System.out.println("a is less then 15");
		} else {
			System.out.println("a is other...");
		}
		System.out.println("End2");

		for (int e = 0; e < 10; e++) {
			if (e % 2 == 0) {
				System.out.println(e);
			}
		}

		for (int e = 0; e < 10; e++) {
			if (e % 2 == 0) {
				System.out.println(e);
			}
		}

		for (int k = 0; k < 10; k += 2) {
			System.out.println(k);
		}

		int f = 231;
		for (int h = 0; h < 6; h++) {
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

		int p = 231;
		for (int l = 0; l < 6; l++) {
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
