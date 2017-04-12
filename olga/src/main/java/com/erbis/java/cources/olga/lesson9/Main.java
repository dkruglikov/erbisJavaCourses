package com.erbis.java.cources.olga.lesson9;

public final class Main {
	private Main() {
	}
	public static void main(String[] args) {
		Calculator c = new Calculator("plus");
		System.out.println(c.getLastOperation());
		System.out.println(c.getLastResult());
	}
}
