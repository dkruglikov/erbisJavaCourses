package com.erbis.java.courses.algorithms.sort;

abstract public class Sorter {
	
	abstract public SortStat sort(int[] arrsy);
	
	protected int compare(int[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setComparisons(sortStat.getComparisons() + 1);
		return Integer.compare(array[i0], array[i1]);
	}
	
	protected int compareWeights(Dog[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setComparisons(sortStat.getComparisons() + 1);
		return Integer.compare(array[i0].weight, array[i1].weight);
	}
	
	protected int compareAges(Dog[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setComparisons(sortStat.getComparisons() + 1);
		return Integer.compare(array[i0].age, array[i1].age);
	}
	
	protected void swap(int[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setSwaps(sortStat.getSwaps() + 1);
		int temp = array[i0];
		array[i0] = array[i1];
		array[i1] = temp;
	}
	
	protected void swap(Dog[] array, int i0, int i1, SortStat sortStat) {
		sortStat.setSwaps(sortStat.getSwaps() + 1);
		Dog temp = array[i0];
		array[i0] = array[i1];
		array[i1] = temp;
	}	
	SortStat sortAges(Dog[] array){
		SortStat stat = new SortStat();
		stat.setSize(array.length);
		long timeBefore = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			int indexMin = i;
			for (int j = i; j < array.length; j++) {
				if (compareAges(array, j, indexMin, stat) < 0) {
					indexMin = j;
				}
			}
			swap(array, i, indexMin, stat);
		}
		stat.setTime(System.currentTimeMillis() - timeBefore);
		return stat;
	}

	SortStat sortWeights(Dog[] array){
		SortStat stat = new SortStat();
		stat.setSize(array.length);
		long timeBefore = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			int indexMin = i;
			for (int j = i; j < array.length; j++) {
				if (compareWeights(array, j, indexMin, stat) < 0) {
					indexMin = j;
				}
			}
			swap(array, i, indexMin, stat);
		}
		stat.setTime(System.currentTimeMillis() - timeBefore);
		return stat;
	}
}
