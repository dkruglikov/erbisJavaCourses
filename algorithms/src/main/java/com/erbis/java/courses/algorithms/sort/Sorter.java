package com.erbis.java.courses.algorithms.sort;

abstract public class Sorter {

	abstract public SortStat sort(int[] arrsy);

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

	SortStat sortWeihgts(Dog[] arrayDog) {
		int[] arrayW = new int[arrayDog.length];
		for (int i = 0; i < arrayW.length; i++) {
			arrayW[i] = arrayDog[i].weight;
		}
		SortStat stat = new SortStat();
		sort(arrayW);
		return stat;
	}

	SortStat sortAges(Dog[] arrayDog) {
		int[] arrayA = new int[arrayDog.length];
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = arrayDog[i].age;
		}
		SortStat stat = new SortStat();
		sort(arrayA);
		return stat;
	}
}
