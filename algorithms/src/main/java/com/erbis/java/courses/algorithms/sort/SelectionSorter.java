package com.erbis.java.courses.algorithms.sort;

public class SelectionSorter extends InsertionSorter {
	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int indexMin=i;
			int min = array[i];
			for (int j = i; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					indexMin = j;
				}
			}
			int t = array[i];
			array[i] = array[indexMin];
			array[indexMin] = t;
		}
	}
}
