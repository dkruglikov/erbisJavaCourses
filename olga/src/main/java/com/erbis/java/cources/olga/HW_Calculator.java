package com.erbis.java.cources.olga;

public class HW_Calculator {

	public static void main(String[] args) {
		String input = "";
		System.out.println("Please, enter the number");
		input = System.console().readLine();
		double result = Double.parseDouble(input);
		do {
			System.out.println("Please, enter the operator");
			String operator = System.console().readLine();
			System.out.println("Please, enter the number");
			input = System.console().readLine();
			double b = Double.parseDouble(input);
			if (operator.equals("+")) {
				result += b;
			}
			if (operator.equals("-")) {
				result -= b;
			}
			if (operator.equals("*")) {
				result *= b;
			}
			if (operator.equals("/")) {
				result /= b;
			}
			System.out.println("The result is: " + result);
		} while (true);
	}

}
