package com.erbis.java.courses.algorithms.sort;

import java.util.Comparator;

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

	@Override
	protected <E> void sort(E[] array, Comparator<? super E> comparator, SortStat sortStat) {
		for (int i = 0; i < array.length; i++) {
			int indexMin = i;
			for (int j = i; j < array.length; j++) {
				if (compare(array, j, indexMin, comparator, sortStat) < 0) {
					indexMin = j;
				}
			}
			swap(array, i, indexMin, sortStat);
		}
	}
}
