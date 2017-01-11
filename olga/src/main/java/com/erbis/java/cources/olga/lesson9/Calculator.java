package com.erbis.java.cources.olga.lesson9;

public class Calculator {
	
	 String lastOperation;
	 double lastResult;

	public String getLastOperation() {
		return lastOperation;
	}
	
	public double getLastResult() {
		return lastResult;
	}
	
	public Calculator() {
		System.out.println("Creating calculator");
//		lastOperation="none";
//		lastResult=-1;
	}
	public Calculator(String lo) {
		lastOperation=lo;
		System.out.println("Creating calculator with last operation");
	}
	public Calculator(double lr) {
		lastResult=lr;
		System.out.println("Creating calculator with last result");
	}
	public Calculator(double lr, String lo) {
		lastOperation=lo;
		lastResult=lr;
		System.out.println("Creating calculator with last operator and result");
	}
}
