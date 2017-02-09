package com.erbis.java.courses.algorithms.matrix;

public final class Matrix {

    private Matrix() {
    }

    public static double[][] create(double[] array, int width, int height) {
        double[][] matrix;
        matrix = new double[width][height];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix = new double[][]{array};
            }
        }
        return matrix;
    }

    public static double sum(double[][] matrix) {
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                sum2 = sum2 + matrix[0][j];
            }
        }
        return sum;
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
