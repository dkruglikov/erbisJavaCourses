package com.erbis.java.courses.max.lesson4;


public class Lesson4 {

    public static void main (String args[]){

        System.out.println(methodTrue() & methodFalse());
//        System.out.println(methodFalse() || methodTrue());

        System.out.print("5.5 < 2: ");
        System.out.println(5.5 < 2);

        System.out.print("7.3 <= 55: ");
        System.out.println(7.3 <= 55);

        System.out.print("8.55 > 3.17: ");
        System.out.println(8.55 > 3.17);

        boolean someBool = (5/2) == 2;
        System.out.println(someBool);

        boolean nonSomeBool = !someBool;
        System.out.println(nonSomeBool);

        byte var1 = (byte) -127;

        byte var2 = (byte) ~var1;
        System.out.println(var2);

        byte b1 = 0b101;
        byte b2 = 0b110;
        System.out.println(b1 ^ b2);
    }

    private static boolean methodTrue() {
        System.out.println("Method True");
        return true;
    }

    private static boolean methodFalse() {
        System.out.println("Method False");
        return false;
    }
}
