package com.erbis.java.cources.olga.lesson8.Calculator_final;

public class MainCalculator {

	public static void main(String[] args) {
		CalculatorFinal c = new CalculatorFinal ();
		System.out.println(c.getLastResult());
		System.out.println(c.plus(5));
		System.out.println(c.division(10));
		System.out.println(c.minus(11));
		System.out.println(c.multiplyation(3));
		System.out.println(c.remainder(4));
	}

}
