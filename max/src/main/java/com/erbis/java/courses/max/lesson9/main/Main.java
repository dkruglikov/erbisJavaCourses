package com.erbis.java.courses.max.lesson9.main;

import com.erbis.java.courses.max.lesson9.Calculator;

public class Main {

    public static void main (String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.getLastOeration());
        System.out.println(calculator.getLastResult());
    }
}
