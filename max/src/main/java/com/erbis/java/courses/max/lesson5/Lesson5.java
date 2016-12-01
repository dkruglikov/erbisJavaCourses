package com.erbis.java.courses.max.lesson5;

public class Lesson5 {

    public static void main(String args[]) {
        int someI = 1;
        byte someByte = 127;
        while (someI < 300) {
            someByte++;
            System.out.println(someByte);
            someI++;
        }

//        int i = 9;
//        if (i % 2 == 0) {
//            System.out.println("i is dividable by 2");
//        } else if (i%3==0) {
//            System.out.println("i is dividable by 3");
//        } else if(i<15){
//            System.out.println("i less then 15");
//        } else  {
//            System.out.println("i is other");
//        }
//        System.out.println("End!");

        for (int i = 0; i < 10; i++) {
            if ((i % 2 == 0) && (i != 0)) {
                System.out.println(i);
            }
        }

        int k = 231;
        for (int i = 0; i < 6; i++) {
            k /= 2;
            if (k % 2 != 0) {
                continue;
            }
            System.out.print("Step ");
            System.out.println(i);
            System.out.println("k is: " + k);
        }
    }
}