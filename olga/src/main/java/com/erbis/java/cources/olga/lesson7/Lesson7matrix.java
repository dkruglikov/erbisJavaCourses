package com.erbis.java.cources.olga.lesson7;

public final class Lesson7matrix {
	private static final int ELEMENT4 = 4;
	private static final int ELEMENT3 = 3;
	private static final int ELEMENT2 = 1;
	private static final int ELEMENT1 = 2;
	private static final int ELEMENT = 8;
	private static final int LENGTH3 = 3;
	private static final int LENGTH2 = 4;
	private static final int LENGTH1 = 3;
	private Lesson7matrix() {
	}
	public static void main(String[] args) {
		int[][] matrix = new int[LENGTH1][];

		matrix[0] = new int[LENGTH2];
		matrix[1] = new int[] {ELEMENT1, ELEMENT2};
		matrix[2] = new int[LENGTH3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

		int[] arr1 = {0, 1, 2, ELEMENT3, ELEMENT4};
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
			System.out.print(" ");
		}
		System.out.println();

		int[] arr2 = arr1;
		// there is no new 5 spaces in memory. it is reference for previous
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			System.out.print(" ");
		}
		System.out.println();

		arr2[0] = ELEMENT;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
