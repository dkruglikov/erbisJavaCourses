package com.erbis.java.courses.max.lesson3;


public class MySecondHW {

    private byte someBite = 9;
    private short someShort = 877;
    private int someInt = 555777;

    private boolean someBoolean = true;
    private char someChar = 'b';

    private long someLong = 2133123;
    private float someFloat = 32.43f;
    private double someDouble = 55.17;

    public static void main(String args[]) {
        MySecondHW mySecondHW = new MySecondHW();
        mySecondHW.getAllSum();
        mySecondHW.getAllSubtractions();
        mySecondHW.getAllMultiplications();
        mySecondHW.getAllDivisions();
        mySecondHW.getAllUndefinedOperations();
    }

    public void getAllSum() {
        int result1 = someBite + someShort;
        System.out.println("bite + short = " + result1);

        int result2 = someInt + someShort;
        System.out.println("int + short = " + result2);

        int result3 = someChar + someShort;
        System.out.println("int + char = " + result3);

        long result4 = someLong + someInt;
        System.out.println("int + long = " + result4);

        float result5 = someFloat + someInt;
        System.out.println("int + float = " + result5);

        double result6 = someDouble + someInt;
        System.out.println("int + double = " + result6);

        double result7 = someDouble + someFloat;
        System.out.println("double + float = " + result7);

    }

    public void getAllSubtractions() {

        int result1 = someBite - someShort;
        System.out.println("bite - short = " + result1);

        int result2 = someInt - someShort;
        System.out.println("int - short = " + result2);

        int result3 = someChar - someShort;
        System.out.println("int - char = " + result3);

        long result4 = someLong - someInt;
        System.out.println("int - long = " + result4);

        float result5 = someFloat - someInt;
        System.out.println("int - float = " + result5);

        double result6 = someDouble - someInt;
        System.out.println("int - double = " + result6);

        double result7 = someDouble - someFloat;
        System.out.println("double - float = " + result7);

    }

    public void getAllMultiplications() {

        int result1 = someBite * someShort;
        System.out.println("bite * short = " + result1);

        int result2 = someInt * someShort;
        System.out.println("int * short = " + result2);

        int result3 = someChar * someShort;
        System.out.println("int * char = " + result3);

        long result4 = someLong * someInt;
        System.out.println("int * long = " + result4);

        float result5 = someFloat * someInt;
        System.out.println("int * float = " + result5);

        double result6 = someDouble * someInt;
        System.out.println("int * double = " + result6);

        double result7 = someDouble * someFloat;
        System.out.println("double * float = " + result7);
    }

    public void getAllDivisions() {

        int result1 = someBite / someShort;
        System.out.println("bite / short = " + result1);

        int result2 = someInt / someShort;
        System.out.println("int / short = " + result2);

        int result3 = someChar / someShort;
        System.out.println("int / char = " + result3);

        long result4 = someLong / someInt;
        System.out.println("int / long = " + result4);

        float result5 = someFloat / someInt;
        System.out.println("int / float = " + result5);

        double result6 = someDouble / someInt;
        System.out.println("int / double = " + result6);

        double result7 = someDouble / someFloat;
        System.out.println("double / float = " + result7);
    }

    public void getAllUndefinedOperations() {

        int result1 = someBite % someShort;
        System.out.println("bite % short = " + result1);

        int result2 = someInt % someShort;
        System.out.println("int % short = " + result2);

        int result3 = someChar % someShort;
        System.out.println("int % char = " + result3);

        long result4 = someLong % someInt;
        System.out.println("int % long = " + result4);

        float result5 = someFloat % someInt;
        System.out.println("int % float = " + result5);

        double result6 = someDouble % someInt;
        System.out.println("int % double = " + result6);

        double result7 = someDouble % someFloat;
        System.out.println("double % float = " + result7);
    }

}
