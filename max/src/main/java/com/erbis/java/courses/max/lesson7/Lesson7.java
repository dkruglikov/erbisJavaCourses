package com.erbis.java.courses.max.lesson7;

public class Lesson7 {

//    public static void main(String args[]) {
//        int[][] matrix;
//        int width = 3;
//        matrix = new int[width][];
//        matrix[0] = new int[4];
//        matrix[1] = new int[]{2, -1};
//        matrix[2] = new int[3];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
        System.out.println();

        int[] arr2 = arr1;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            System.out.print(" ");
        }

        System.out.println();

        arr2[0] = 8;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
    }
}