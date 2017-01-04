package com.erbis.java.cources.yana.myCalculator;

public class Calculator {
	private String lastOperation;
	private double lastResult;

	public String getLastOperation() {
		return lastOperation;
	}

	public double getLastResult() {
		return lastResult;
	}

	public double sum(double arg1, double arg2) {
		lastOperation = "Sum: " + arg1 + " + " + arg2 + " = ";
		System.out.print(lastOperation);
		return lastResult = arg1 + arg2;
	}

	public double subtraction(double arg1, double arg2) {
		lastOperation = "Subtraction: " + arg1 + " - " + arg2 + " = ";
		System.out.print(lastOperation);
		return lastResult = arg1 - arg2;
	}

	public double division(double arg1, double arg2) {
		lastOperation = "Division: " + arg1 + " / " + arg2 + " = ";
		if (arg2 != 0) {
			System.out.print(lastOperation);
			return lastResult = arg1 / arg2;
		} else {
			System.out.println("Division by zero is not allowed");
			return lastResult = 0;
		}
	}

	public double multiplication(double arg1, double arg2) {
		lastOperation = "Multiplication: " + arg1 + " * " + arg2 + " = ";
		System.out.print(lastOperation);
		return lastResult = arg1 * arg2;
	}

	public double modulo(double arg1, double arg2) {
		lastOperation = "Modulo: " + arg1 + " % " + arg2 + " = ";
		if (arg2 != 0) {
			System.out.print(lastOperation);
			return lastResult  = arg1 % arg2;
		} else {
			System.out.println("Division by zero is not allowed");
			return lastResult = 0;
		}
	}

	public Calculator() {
		lastOperation = "none";
		lastResult = 0;
	}

	public Calculator(String lo, double lr) {
		lastOperation = lo;
		lastResult = lr;
	}

}
