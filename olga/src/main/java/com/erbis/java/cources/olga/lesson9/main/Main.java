package com.erbis.java.cources.olga.lesson9.main;

import com.erbis.java.cources.olga.lesson9.Calculator;

public class Main {
		public static void main(String[] args) {
			Calculator c = new Calculator(0.5 , "test");
			System.out.println(c.getLastOperation());
			System.out.println(c.getLastResult());
		}
}
