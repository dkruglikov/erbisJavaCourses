package lesson5;

public class MyFourthWHW {

	public static void main(String[] args) {
//Task1
		// for (int i = 0; i < 10; i++) {
		// System.out.println("Zero");
		//
		// }

//Task 2		
		int j = 1;
		while (j < 8000) {
			j *= 2;
			if (j % 16 == 0) {
				continue;
			}
			System.out.println(j);
		}

	}
}