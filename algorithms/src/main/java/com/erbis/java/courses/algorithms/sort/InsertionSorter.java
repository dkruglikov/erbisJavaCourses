package com.erbis.java.courses.algorithms.sort;

import java.util.Comparator;

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

    @Override
    protected <E> void sort(E[] array, Comparator<? super E> comparator, SortStat sortStat) {
        // TODO Auto-generated method stub
        
    }
}
