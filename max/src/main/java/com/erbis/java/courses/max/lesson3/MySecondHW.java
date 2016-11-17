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

        System.out.println("byte is " + someBite);
        System.out.println("short is " + someShort);
        System.out.println("int is " + someInt);
        System.out.println("boolean is " + someBoolean);
        System.out.println("char is " + someChar);
        System.out.println("long is " + someLong);
        System.out.println("float is " + someFloat);
        System.out.println("double is " + someDouble);
        System.out.println("--------------------------------------------------");

        System.out.println("Sums are: ");
        System.out.println("================================");
        int result1 = someBite + someShort;
        System.out.println("bite + short = " + result1);

        int result2 = someInt + someShort;
        System.out.println("int + short = " + result2);

        int result3 = someChar + someShort;
        System.out.println("short + char = " + result3);

        long result4 = someLong + someInt;
        System.out.println("int + long = " + result4);

        float result5 = someFloat + someInt;
        System.out.println("int + float = " + result5);

        double result6 = someDouble + someInt;
        System.out.println("int + double = " + result6);

        double result7 = someDouble + someFloat;
        System.out.println("double + float = " + result7);
        System.out.println("================================");
    }

    public void getAllSubtractions() {

        System.out.println("Subtractions are: ");
        System.out.println("================================");
        int result1 = someBite - someShort;
        System.out.println("bite - short = " + result1);

        int result2 = someInt - someShort;
        System.out.println("int - short = " + result2);

        int result3 = someInt - someChar;
        System.out.println("int - char = " + result3);

        long result4 = someInt - someLong;
        System.out.println("int - long = " + result4);

        float result5 = someInt - someFloat;
        System.out.println("int - float = " + result5);

        double result6 = someInt - someDouble;
        System.out.println("int - double = " + result6);

        double result7 = someDouble - someFloat;
        System.out.println("double - float = " + result7);
        System.out.println("================================");
    }

    public void getAllMultiplications() {

        System.out.println("Multiplications are: ");
        System.out.println("================================");
        int result1 = someBite * someShort;
        System.out.println("bite * short = " + result1);

        int result2 = someInt * someShort;
        System.out.println("int * short = " + result2);

        int result3 = someChar * someShort;
        System.out.println("short * char = " + result3);

        long result4 = someLong * someInt;
        System.out.println("int * long = " + result4);

        float result5 = someFloat * someInt;
        System.out.println("int * float = " + result5);

        double result6 = someDouble * someInt;
        System.out.println("int * double = " + result6);

        double result7 = someDouble * someFloat;
        System.out.println("double * float = " + result7);
        System.out.println("================================");
    }

    public void getAllDivisions() {

        System.out.println("Divisions are: ");
        System.out.println("================================");
        int result1 = someBite / someShort;
        System.out.println("bite / short = " + result1);

        int result2 = someInt / someShort;
        System.out.println("int / short = " + result2);

        int result3 = someShort / someChar;
        System.out.println("short / char = " + result3);

        long result4 = someInt / someLong;
        System.out.println("int / long = " + result4);

        float result5 = someFloat / someInt;
        System.out.println("float / int = " + result5);

        double result6 = someDouble / someInt;
        System.out.println("double / int = " + result6);

        double result7 = someFloat / someDouble;
        System.out.println("float / double = " + result7);
        System.out.println("================================");
    }

    public void getAllUndefinedOperations() {

        System.out.println("Undefined operations are: ");
        System.out.println("================================");
        int result1 = someBite % someShort;
        System.out.println("bite % short = " + result1);

        int result2 = someInt % someShort;
        System.out.println("int % short = " + result2);

        int result3 = someShort % someChar;
        System.out.println("int % char = " + result3);

        long result4 = someLong % someInt;
        System.out.println("long % int = " + result4);

        float result5 = someFloat % someInt;
        System.out.println("float % int = " + result5);

        double result6 = someDouble % someInt;
        System.out.println("double % int = " + result6);

        double result7 = someDouble % someFloat;
        System.out.println("double % float = " + result7);
        System.out.println("================================");
    }
}
