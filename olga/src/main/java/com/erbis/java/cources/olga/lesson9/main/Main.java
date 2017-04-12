package com.erbis.java.cources.olga.lesson9.main;

import com.erbis.java.cources.olga.lesson9.Calculator;

public final class Main {
	private static final double ARGUMENT_ONE = 0.5;
	private Main() {
	}
		public static void main(String[] args) {
			Calculator c = new Calculator(ARGUMENT_ONE, "test");
			System.out.println(c.getLastOperation());
			System.out.println(c.getLastResult());
		}
}
