package com.erbis.java.courses.algorithms.sort;

public final class InsertionSorter extends Sorter {

	@Override
	protected void sort(int[] array, SortStat sortStat) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && compare(array, j - 1, i, sortStat) > 0) {
				j--;
			}
			if (i != j) {
				move(array, i, j, sortStat);
			}
		}
	}
}
