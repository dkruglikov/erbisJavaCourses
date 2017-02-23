package com.erbis.java.courses.algorithms.sort.bubbleSort;

import com.erbis.java.courses.algorithms.sort.InsertionSorter;
import com.erbis.java.courses.algorithms.sort.SortStat;

public class BubbleSort extends InsertionSorter {
//	private SortStat sortStat = new SortStat();
	@Override
	public void sort(int[] array, SortStat sortStat) {
		int i0 = 0;
		int i1 = 0;
		for (int j = array.length - 1; j > 0; j--){
			for (int i = 0; i < j; i++){
				i0 = i;
				i1 = i + 1;
				int res = compare(array, i0, i1, sortStat);
				if (res > 0) {
					swap(array, i0, i1, sortStat);
				
				}
			}
		}
	}
}
