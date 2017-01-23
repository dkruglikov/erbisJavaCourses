package com.erbis.java.courses.max.lesson9;

public class Calculator {

    String lastOperation;
    double lastResult;

    public Calculator(){
        System.out.println("Creating calculator");
        lastOperation = "none";
        lastResult =-1;
    }

    public Calculator(String lo){
        lastOperation = lo;
        System.out.println("Creating calculator with last operation");
    }

    public Calculator(double lr){
        lastResult = lr;
        System.out.println("Creating calculator with last result");
    }

    public Calculator(String aa, double bb) {
        lastOperation = aa;
        lastResult = bb;
        System.out.println("operation + result");
    }

    public String getLastOeration(){
        return lastOperation;
    }

    public double getLastResult(){
        return lastResult;
    }
}
