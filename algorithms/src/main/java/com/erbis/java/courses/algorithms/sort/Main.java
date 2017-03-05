package com.erbis.java.courses.algorithms.sort;

public final class Main {
	// CHECKSTYLE:OFF

	private static final int C_25 = 25;
	private static final int C_5 = 5;
	private static final int C_16 = 16;
	private static final int C_4 = 4;
	private static final int C_9 = 9;
	private static final int C_3 = 3;
	
	private Main() {
		
	}

	public static void main(String[] args) {
		Dog[] dogs = new Dog[] {
				new Dog(C_3, C_9),
				new Dog(1, 1),
				new Dog(2, C_4),
				new Dog(C_4, C_16),
				new Dog(C_5, C_25)};
		
		DogsSorter dogsSorter = new DogsSorter(); 
		int[] ages = dogsSorter.sortAges(dogs);
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		
		System.out.println(" ");
		
		int[] weights = dogsSorter.sortWeights(dogs);
		for (int i = 0; i < weights.length; i++) {
			System.out.print(weights[i] + " ");
		}
	}
	// CHECKSTYLE:ON
}