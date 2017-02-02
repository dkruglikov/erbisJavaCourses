package com.erbis.java.courses.algorithms.sort;

public class SelectionSorter extends InsertionSorter {
	@Override
	public SortStat sort(int[] array) {
		SortStat stat = new SortStat();
		stat.setSize(array.length);
		long timeBefore = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			int indexMin = i;
//			int min = array[i];
			for (int j = i; j < array.length; j++) {
				if (compare(array, j, indexMin, stat) < 0) {
					indexMin = j;
				}
//				stat.setComparisons(stat.getComparisons() + 1);
//				if (min > array[j]) {
//					min = array[j];
//					indexMin = j;
//				}
			}
			swap(array, i, indexMin, stat);
		}
		stat.setTime(System.currentTimeMillis() - timeBefore);
		return stat;
	}
}
