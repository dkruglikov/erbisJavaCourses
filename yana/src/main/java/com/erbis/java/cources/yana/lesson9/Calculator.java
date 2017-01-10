package com.erbis.java.cources.yana.lesson9;

public class Calculator {
	private String lastOperation;
	private double lastResult;
	public Calculator() {
		System.out.println("Creating calculator");
		lastOperation = "none";
		lastResult = -1;
	}
	
	public String getlastOperation() {
		return lastOperation;
	}
	
	public double getlastResult() {
		return lastResult;
	}
	
	public Calculator(String lo) {
		lastOperation = lo;
		System.out.println("Creating calculator with last operation");
	}
	
	public Calculator(double lr) {
		lastResult = lr;
		System.out.println("Creating calculator with last result");
	}
	
	public Calculator(String lo, double lr) {
		lastResult = lr;
		lastOperation = lo;
		System.out.println("Creating calculator with last operation and result");
	}
}
