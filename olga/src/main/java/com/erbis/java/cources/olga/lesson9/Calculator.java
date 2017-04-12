package com.erbis.java.cources.olga.lesson9;

public class Calculator {
	
	 private String lastOperation;
	 private double lastResult;

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
		setLastOperation(lo);
		System.out.println("Creating calculator with last operation");
	}
	public Calculator(double lr) {
		setLastResult(lr);
		System.out.println("Creating calculator with last result");
	}
	public Calculator(double lr, String lo) {
		setLastOperation(lo);
		setLastResult(lr);
		System.out.println("Creating calculator with last operator and result");
	}

	public void setLastOperation(String lastOperation) {
		this.lastOperation = lastOperation;
	}

	public void setLastResult(double lastResult) {
		this.lastResult = lastResult;
	}
}
