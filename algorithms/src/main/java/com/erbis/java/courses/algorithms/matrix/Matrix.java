package com.erbis.java.courses.algorithms.matrix;

public final class Matrix {

	private Matrix() {
	}

	public static double[][] create(double[] array, int width, int height) {
		double[][] matrix = new double[height][width];
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
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static double sumAbs(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					matrix[i][j] = matrix[i][j] * (-1);
				}
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static double mainDiagonalSum(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
			}
		}
		return sum;
	}

	public static double mainDiagonalAndAboveSum(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j || i < j) {
					sum += matrix[i][j];
				}
			}
		}
		return sum;
	}

	public static double sideDiagonalSum(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j == matrix.length - 1) {
					sum += matrix[i][j];
				}
			}
		}
		return sum;
	}

	public static double max(double[][] matrix) {
		double max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	public static double min(double[][] matrix) {
		double min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	public static double[] maxRow(double[][] matrix) {
		double[] maxRow = matrix[0];
		double max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxRow = matrix[j];
				}
			}
		}
		return maxRow;
	}

	public static double[] maxColumn(double[][] matrix) {
		double[] maxColumn = matrix[0];
		double max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxColumn = matrix[j];
				}
			}
		}
		return maxColumn;
	}
}
