package com.erbis.java.courses.algorithms.sort;

public class InsertionSorter {
	
	public void sort(int[] array) {
		throw new UnsupportedOperationException();
	}
	
	protected int compare(int[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setComparisons(sortStat.getComparisons() + 1);
		return Integer.compare(array[i0], array[i1]);
	}
	
	protected void swap(int[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setSwaps(sortStat.getSwaps() + 1);
		int temp = array[i0];
		array[i0] = array[i1];
		array[i1] = temp;
	}
}
