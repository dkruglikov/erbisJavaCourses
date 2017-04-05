package com.erbis.java.cources.olga.lesson8.Calculator_final;

public class CalculatorFinal {

	private String lastOperation;
	private double lastResult;
	
	public String getLastOperation() {
		return lastOperation;
	}
	public double getLastResult() {
		return lastResult;
	}
	
	private void print(double arg) {
		System.out.println(lastOperation);
		System.out.println(arg);
		System.out.println("is");
	}
	
	public double plus(double arg) {
		lastOperation = "plus";
		lastResult += arg;
		print(arg);
		return lastResult;
	}
	
	public double minus(double arg) {
		lastOperation = "minus";
		lastResult -= arg;
		print(arg);
		return lastResult;
	}
	
	public double multiplyation(double arg) {
		lastOperation = "mult";
		lastResult *= arg;
		print(arg);
		return lastResult;
	}
	
	public double division(double arg) {
		lastOperation = "division";
		lastResult /= arg;
		print(arg);
		return lastResult;
	}
	
	public double remainder(double arg) {
		lastOperation = "remainder";
		lastResult %= arg;
		print(arg);
		return lastResult;
	}
}