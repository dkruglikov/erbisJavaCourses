package com.erbis.java.courses.algorithms.sort;

public class SelectionSorter extends Sorter {
	@Override
	public void sort(int[] array, SortStat sortStat) {
		for (int i = 0; i < array.length; i++) {
			int indexMin = i;
			for (int j = i; j < array.length; j++) {
				if (compare(array, j, indexMin, sortStat) < 0) {
					indexMin = j;
				}
			}
			swap(array, i, indexMin, sortStat);
		}
	}
}
