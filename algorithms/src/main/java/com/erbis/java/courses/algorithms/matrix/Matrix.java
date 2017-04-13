package com.erbis.java.courses.algorithms.matrix;

import static java.lang.Math.abs;

public final class Matrix {

    private Matrix() {
    }

    public static double[][] create(double[] array, int width, int height) {
        double[][] matrix = new double[height][width];
        int arrayNumber = 0;
        for (int index = 0; index < height; index++) {
            for (int index2 = 0; index2 < width; index2++) {
                if (arrayNumber < array.length) {
                    matrix[index][index2] = array[arrayNumber];
                    arrayNumber++;
                }
            }
        }
        return matrix;
    }

    public static double sum(double[][] matrix) {
        double sum = 0;
        for (int index = 0; index < matrix.length; index++) {
            for (int index2 = 0; index2 < matrix[index].length; index2++) {
                sum = sum + matrix[index][index2];
            }
        }
        return sum;
    }

    public static double sumAbs(double[][] matrix) {
        double sumAbs = 0;
        for (int index = 0; index < matrix.length; index++) {
            for (int index2 = 0; index2 < matrix[index].length; index2++) {
                sumAbs = sumAbs + abs(matrix[index][index2]);
            }
        }
        return sumAbs;
    }

    public static double mainDiagonalSum(double[][] matrix) {
        double diagonalSum;
        int nextNumber = 1;
        if (matrix[0].length != 0) {
            diagonalSum = matrix[0][0];
            for (int index = 1; index < matrix.length; index++) {
                if (matrix[index].length > nextNumber) {
                    diagonalSum = diagonalSum + matrix[nextNumber][nextNumber];
                    nextNumber++;
                    if (nextNumber == index) {
                        return diagonalSum;
                    }
                } else {
                    nextNumber++;
                }
            }
        } else {
            diagonalSum = 0;
        }
        return diagonalSum;
    }

    public static double mainDiagonalAndAboveSum(double[][] matrix) {
        return 0;
    }

    public static double sideDiagonalSum(double[][] matrix) {
        return 0;
    }

    public static double max(double[][] matrix) {
        double max = matrix[0][0];
        for (int index = 0; index < matrix.length; index++) {
            for (int index2 = 0; index2 < matrix[index].length; index2++) {
                if ((matrix[index][index2]) > max) {
                    max = (matrix[index][index2]);
                }
            }
        }
        return max;
    }

    public static double min(double[][] matrix) {
        double min = matrix[0][0];
        for (int index = 0; index < matrix.length; index++) {
            for (int index2 = 0; index2 < matrix[index].length; index2++) {
                if ((matrix[index][index2]) < min) {
                    min = (matrix[index][index2]);
                }
            }
        }
        return min;
    }

    public static double[] maxRow(double[][] matrix) {
        double[] maxRow = matrix[0];
        int maxRowNumber = 0;
        double previousRowSum = matrix[0][0];
        double maxRowSum = matrix[0][0];
        for (int index = 0; index < matrix.length; index++) {
            for (int index2 = 0; index2 < matrix[index].length; index2++) {
                maxRowSum = maxRowSum + matrix[index][index2];
            }
            if (maxRowSum > previousRowSum) {
                maxRowNumber = index;
                previousRowSum = maxRowSum;
            }
        }
        maxRow = matrix[maxRowNumber];
        return maxRow;
    }

    public static double[] maxColumn(double[][] matrix) {
        return null;
    }
}
