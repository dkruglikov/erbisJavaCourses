package com.erbis.java.cources.yana.lesson6;

public class Lesson6 {
	public static void main(String[] args) {
		boolean[] arr1 = new boolean [10];
		for (int i = 0; i<arr1.length; i++){
			System.out.print("Element ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(arr1[i]);
		}
		System.out.println(" ");
		
		byte[] arr2 = {1, 2, 3, 4, 5, 15, 25, 30};
		for (int i = 0; i<arr2.length; i++){
			System.out.print("Element ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(arr2[i]);
		}
		System.out.println(" ");
		
		byte[] arr3 = new byte[] {100, 50, 40, 30, 20, 10};
		for (int i = 0; i<arr3.length; i++){
			System.out.print("Element ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(arr3[i]);
		}
	}

}
