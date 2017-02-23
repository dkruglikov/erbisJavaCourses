package com.erbis.java.courses.algorithms.sort;

public class Main {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[] {
				new Dog(3, 9),
				new Dog(1, 1),
				new Dog(2, 4),
				new Dog(4, 16),
				new Dog(5, 25)};
		
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
}