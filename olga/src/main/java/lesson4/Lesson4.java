package lesson4;

public class Lesson4 {

	public static void main(String[] args) {
		System.out.print("5.5<2: ");
		System.out.println(5.5 < 2);

		boolean b = (5 / 2) == 2;
		System.out.println(b);
		boolean nonB = !b;
		System.out.println(nonB);

		int var1 = 0;
		System.out.println(var1);

		int var2 = ~var1;
		System.out.println(var2);

		System.out.println(methodTrue()&methodFalse());

		byte b1=0b101;
		byte b2=0b110;
		System.out.println(b1^b2);
	}

	public static boolean methodTrue() {
		System.out.print("MethodTrue");
		return true;
	}

	public static boolean methodFalse() {
		System.out.print("MethodFalse");
		return false;
	}
}
