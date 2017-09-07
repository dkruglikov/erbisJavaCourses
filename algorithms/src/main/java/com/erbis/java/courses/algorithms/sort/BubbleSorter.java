package com.erbis.java.courses.algorithms.sort;

import java.util.Comparator;

public final class BubbleSorter extends Sorter {
//	private SortStat sortStat = new SortStat();
	@Override
	public void sort(int[] array, SortStat sortStat) {
		int i0 = 0;
		int i1 = 0;
		for (int j = array.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				i0 = i;
				i1 = i + 1;
				int res = compare(array, i0, i1, sortStat);
				if (res > 0) {
					swap(array, i0, i1, sortStat);
				
				}
			}
		}
	}

    @Override
    protected <E> void sort(E[] array, Comparator<? super E> comparator, SortStat sortStat) {
        // TODO Auto-generated method stub
        
    }
}
