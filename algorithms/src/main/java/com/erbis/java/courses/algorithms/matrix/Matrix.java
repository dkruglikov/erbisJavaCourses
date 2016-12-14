package com.erbis.java.courses.algorithms.matrix;

public final class Matrix {
	
	private Matrix() {
	}
	
	public static double[][] create(double[] array, int width, int height) {
		double[][] matrix = new double [height][width];
		int k = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (k < array.length) {
					matrix[i][j] = array[k];
					k++;
				}
			}
		}
		return matrix;
	}
	
	public static double sum(double[][] matrix) {
		return 0;
	}
	
	public static double sumAbs(double[][] matrix) {
		return 0;
	}
	
	public static double mainDiagonalSum(double[][] matrix) {
		return 0;
	}
	
	public static double mainDiagonalAndAboveSum(double[][] matrix) {
		return 0;
	}
	
	public static double sideDiagonalSum(double[][] matrix) {
		return 0;
	}
	
	public static double max(double[][] matrix) {
		return 0;
	}
	
	public static double min(double[][] matrix) {
		return 0;
	}
	
	public static double[] maxRow(double[][] matrix) {
		return null;
	}
	
	public static double[] maxColumn(double[][] matrix) {
		return null;
	}
}
