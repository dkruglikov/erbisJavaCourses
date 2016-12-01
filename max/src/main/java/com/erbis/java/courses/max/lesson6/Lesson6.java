package com.erbis.java.courses.max.lesson6;

public class Lesson6 {

    public static void main (String [] args) {
        boolean[] someV1;
        someV1 = new boolean[5];
//        System.out.println(someV1);

        int[] someV2 = {10, -55, 3, 55};
//        System.out.println(someV2);

        int[] someV3;
        someV3 = new int[]{10,55,3,55};
//        System.out.println(someV1);

        for(int i=0; i<someV2.length; i++){
            System.out.print("Element ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(someV2[i]);
        }
        System.out.println("");

        for(int i=0; i<someV3.length; i++){
            System.out.print("Element ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(someV3[i]);
        }
        System.out.println("");

        for(int i=0; i<someV1.length; i++){
            System.out.print("Element ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(someV1[i]);
            System.out.println("");
        }
    }
}
