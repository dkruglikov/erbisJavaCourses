package com.erbis.java.courses.algorithms.sort;

public abstract class Sorter {
	
	public SortStat sort(int[] array) {
		SortStat sortStat = new SortStat();
		sortStat.setSize(array.length);
		long startTime = System.currentTimeMillis();
		sort(array, sortStat);
		sortStat.setTime(System.currentTimeMillis() - startTime);
		return sortStat;
	}
	
	protected abstract void sort(int[] array, SortStat sortStat);
	
	protected int compare(int[] array, int i0, int i1, SortStat sortStat) {
		sortStat.increaseComparisons();
		return Integer.compare(array[i0], array[i1]);
	}
	
	protected void swap(int[] array, int i0, int i1, SortStat sortStat) {
		sortStat.increaseSwaps();
		int temp = array[i0];
		array[i0] = array[i1];
		array[i1] = temp;
	}
	
	protected void move(int[] array, int fromIndex, int toIndex,
			SortStat sortStat) {
		sortStat.increaseSwaps();
		int temp = array[fromIndex];
		int direction = Integer.signum(toIndex - fromIndex);
		for (int i = fromIndex; i != toIndex; i += direction) {
			array[i] = array[i + direction];
		}
		array[toIndex] = temp;
	}
}
