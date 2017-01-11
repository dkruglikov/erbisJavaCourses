package com.erbis.java.cources.olga.lesson8;

public class HW1_Calculator {
	public static void main(String[] args) {
		String input = "";
		System.out.println("Please, enter the comand, like '5-3-1' or '5*4*9'");
		input = System.console().readLine();
		if (input.contains("+")) {
			String[] arr1 = input.split("\\+");
			int sum = 0;
			for (int i = 0; i < arr1.length; i++) {
				sum += Integer.parseInt(arr1[i]);
			}
			System.out.println("The result is:" + sum);
		}
		if (input.contains("-")) {
			String[] arr1 = input.split("\\-");
			int minus = Integer.parseInt(arr1[0]);
			for (int i = 1; i < arr1.length; i++) {
				minus -= Integer.parseInt(arr1[i]);
			}
			System.out.println("The result is:" + minus);
		}
		if (input.contains("*")) {
			String[] arr1 = input.split("\\*");
			int mult=Integer.parseInt(arr1[0]);
			for (int i = 1; i < arr1.length; i++) {
				mult *= Integer.parseInt(arr1[i]);
			}
			System.out.println("The result is:" + mult);
		}
		if (input.contains("/")) {
			String[] arr1 = input.split("\\/");
			double div = Double.parseDouble(arr1[0]);
			for (int i = 1; i < arr1.length; i++) {
				div /= Double.parseDouble(arr1[i]);
			}
			System.out.println("The result is:" + div);
		}
		
	}

}
