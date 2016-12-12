package com.erbis.java.courses.algorithms.matrix;

public final class Matrix {

	private Matrix() {
	}

	public static double[][] create(double[] array, int width, int height) {
		double[][] matrix1 = new double[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {

				int k = i * width + j;
				if (k < array.length) {
					matrix1[i][j] = array[k];
				}
			}
		}
		return matrix1;
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

	// as I understood it should be sum of abs
	public static double sumAbs(double[][] matrix) {
		double sumA = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				double a = matrix[i][j];
				if (a > 0) {
					sumA += a;
				} else {
					sumA -= a;
				}
			}
		}
		return sumA;

	}

	// it works only for rectangular matrixes
	// public static double mainDiagonalSum(double[][] matrix) {
	// double sumD = 0;
	// for (int i = 0; i < matrix.length && i < matrix[i].length; i++) {
	// sumD += matrix[i][i];
	// }
	// return sumD;
	// }

	public static double mainDiagonalSum(double[][] matrix) {
		double sumD = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					sumD += matrix[i][j];
				}
			}
		}
		return sumD;
	}

	public static double mainDiagonalAndAboveSum(double[][] matrix) {
		double sumDA = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i <= j) {
					sumDA += matrix[i][j];
				}
			}
		}
		return sumDA;
	}

	public static double sideDiagonalSum(double[][] matrix) {
		double sumSD = 0;
		for (int i = 0; i < matrix.length && i < matrix[i].length; i++) {
			sumSD += matrix[i][matrix[i].length - i];
		}
		return sumSD;
	}

	public static double max(double[][] matrix) {
		double max = -Double.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	public static double min(double[][] matrix) {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	public static double[] maxRow(double[][] matrix) {
		double maxSumR = Double.MIN_VALUE;
		int maxI = 0;
		for (int i = 0; i < matrix.length; i++) {
			double sumR = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sumR += matrix[i][j];
			}
			if (maxSumR < sumR) {
				maxSumR = sumR;
				maxI = i;
			}
		}
		return matrix[maxI];
	}

	// it works only for rectangular matrixes
	public static double[] maxColumn(double[][] matrix) {
		double maxSumC = Double.MIN_VALUE;
		int maxJ = 0;
		for (int j = 0; j < matrix[0].length; j++) {
			double sumC = 0;
			for (int i = 0; i < matrix.length; i++) {
				sumC += matrix[i][j];
			}
			if (maxSumC < sumC) {
				maxSumC = sumC;
				maxJ = j;
			}
		}
		double[] arrMC = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			arrMC[i] = matrix[i][maxJ];
		}
		return arrMC;
	}
}
