package lesson9.main;

import lesson9.Calculator;

public class Main {
	public static void main (String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.getlastOperation());
		System.out.println(c.getlastResult());
	}
}
