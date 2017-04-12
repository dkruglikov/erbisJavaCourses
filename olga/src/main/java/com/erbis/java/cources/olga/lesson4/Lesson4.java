package com.erbis.java.cources.olga.lesson4;

public final class Lesson4 {
	private Lesson4() {
	}
	private static final int NUMBER2 = 5;
	private static final double NUMBER = 5.5;
	private static final int CONST2_BIN = 0b110;
	private static final int CONST1_BIN = 0b101;

	public static void main(String[] args) {
		System.out.print("5.5<2: ");
		System.out.println(NUMBER < 2);

		boolean b = (NUMBER2 / 2) == 2;
		System.out.println(b);
		boolean nonB = !b;
		System.out.println(nonB);

		int var1 = 0;
		System.out.println(var1);

		int var2 = ~var1;
		System.out.println(var2);

		System.out.println(methodTrue() & methodFalse());

		byte b1 = CONST1_BIN;
		byte b2 = CONST2_BIN;
		System.out.println(b1 ^ b2);
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
