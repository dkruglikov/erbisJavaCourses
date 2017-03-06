package com.erbis.java.courses.algorithms.sort;

public class DogsSorter {
	
	private Sorter sorter = new BubbleSorter();
	
	public int[] sortAges(Dog[] dogs) {
		int[] ages = new int[dogs.length];
		for (int i = 0; i < dogs.length; i++) {
			ages[i] = dogs[i].getAge();
		}
		sorter.sort(ages);
		return ages;
	}

	public int[] sortWeights(Dog[] dogs) {
		int[] weights = new int[dogs.length];
		for (int i = 0; i < dogs.length; i++) {
			weights[i] = dogs[i].getWeight();
		}
		sorter.sort(weights);
		return weights;
	}
}
