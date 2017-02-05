package com.erbis.java.courses.algorithms.sort;

public class SelectionSorter extends Sorter {
	@Override
	public SortStat sort(int[] array) {
		SortStat stat = new SortStat();
		stat.setSize(array.length);
		long timeBefore = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			int indexMin = i;
			for (int j = i; j < array.length; j++) {
				if (compare(array, j, indexMin, stat) < 0) {
					indexMin = j;
				}
			}
			swap(array, i, indexMin, stat);
		}
		stat.setTime(System.currentTimeMillis() - timeBefore);
		return stat;
	}
}
