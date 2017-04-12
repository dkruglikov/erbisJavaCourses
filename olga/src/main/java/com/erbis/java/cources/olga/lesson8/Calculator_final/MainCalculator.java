package com.erbis.java.cources.olga.lesson8.Calculator_final;

public final class MainCalculator {
	private static final int ARGUMENT_SIX = 4;
	private static final int ARGUMENT_FIVE = 3;
	private static final int ARGUMANT_FOUR = 11;
	private static final int ARGUMENT_THREE = 10;
	private static final int ARGUMENT_TWO = 5;

	private MainCalculator() {
	}

	public static void main(String[] args) {
		CalculatorFinal c = new CalculatorFinal();
		System.out.println(c.getLastResult());
		System.out.println(c.plus(ARGUMENT_TWO));
		System.out.println(c.division(ARGUMENT_THREE));
		System.out.println(c.minus(ARGUMANT_FOUR));
		System.out.println(c.multiplyation(ARGUMENT_FIVE));
		System.out.println(c.remainder(ARGUMENT_SIX));
	}

}
