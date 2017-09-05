package com.erbis.java.courses.algorithms.sort;

import java.util.Comparator;

public abstract class Sorter {
	
	public SortStat sort(int[] array) {
		SortStat sortStat = new SortStat(array.length);
		long startTime = System.currentTimeMillis();
		sort(array, sortStat);
		sortStat.setTime(System.currentTimeMillis() - startTime);
		return sortStat;
	}
	
	public SortStat sortAges(Dog[] dogs) {
        int[] arrayToSort = new int[dogs.length];
        for (int index = 0; index < dogs.length; index++) {
            arrayToSort[index] = dogs[index].getAge();
        }
        sort(arrayToSort);
        SortStat stats = new SortStat(dogs.length);
        return stats;
    }

    public SortStat sortWeights(Dog[] dogs) {
        int[] arrayToSort = new int[dogs.length];
        for (int index = 0; index < dogs.length; index++) {
            arrayToSort[index] = dogs[index].getWeight();
        }
        sort(arrayToSort);
        SortStat stats = new SortStat(dogs.length);
        return stats;
    }
	
	public <E> SortStat sort(E[] array, Comparator<? super E> comparator) {
		SortStat sortStat = new SortStat(array.length);
		long startTime = System.currentTimeMillis();
		sort(array, comparator, sortStat);
		sortStat.setTime(System.currentTimeMillis() - startTime);
		return sortStat;
	}
	
	protected abstract void sort(int[] array, SortStat sortStat);
	
	protected abstract <E> void sort(E[] array, Comparator<? super E> comparator, SortStat sortStat);
	
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
	protected <E> void move(E[] array, int fromIndex, int toIndex,
						SortStat sortStat) {
		sortStat.increaseSwaps();
		E temp = array[fromIndex];
		int direction = Integer.signum(toIndex - fromIndex);
		for (int i = fromIndex; i != toIndex; i += direction) {
			array[i] = array[i + direction];
		}
		array[toIndex] = temp;
	}
}
