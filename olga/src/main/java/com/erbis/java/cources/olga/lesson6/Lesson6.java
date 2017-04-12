package com.erbis.java.cources.olga.lesson6;

public final class Lesson6 {
	private static final int NUMBER8 = 4;
	private static final int NUMBER7 = 3;
	private static final int NUMBER6 = 2;
	private static final int NUMBER5 = 1;
	private static final int NUMBER4 = 13;
	private static final int NUMBER3 = 12;
	private static final int NUMBER2 = 11;
	private static final int NUMBER1 = 10;
	private static final int LENGTH1 = 10;
	private Lesson6() {
	}
	public static void main(String[] args) {
		// 1
		boolean[] arr1 = new boolean[LENGTH1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Element ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(arr1[i]);
		}
		System.out.println();
		// 2
		byte[] arr2 = {NUMBER1, NUMBER2, NUMBER3, NUMBER4};
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Element ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(arr2[i]);
		}
		System.out.println();
		// 3
		byte[] arr3 = new byte[] {NUMBER5, NUMBER6, NUMBER7, NUMBER8};
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("Element ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(arr3[i]);
		}
		System.out.println();
	}
}
