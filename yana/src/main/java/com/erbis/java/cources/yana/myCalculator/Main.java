package com.erbis.java.cources.yana.myCalculator;

public class Main {
	public static void main (String[] args) {
		Calculator c = new Calculator();
		int arg1 = 100;
		int arg2 = 9;
		
		System.out.println(c.sum(arg1, arg2));
		System.out.println(c.subtraction(arg1, arg2));
		System.out.println(c.division(arg1, arg2));
		System.out.println(c.multiplication(arg1, arg2));
		System.out.println(c.modulo(arg1, arg2));
	}
}
