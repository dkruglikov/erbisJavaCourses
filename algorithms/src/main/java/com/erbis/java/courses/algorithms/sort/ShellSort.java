package com.erbis.java.courses.algorithms.sort;

public class ShellSort extends Sorter {

    @Override
    public void sort(int[] array, SortStat sortStat) {
        int[] sortedArray = array;
        for (int gap = (array.length) / 2; gap > 0; gap /= 2) {
            for (int index = 0; index < (array.length - gap); index++) {
                if ((compare(array, index, (index + gap), sortStat)) > 0) {
                    swap(array, index, (index + gap), sortStat);
                    while (((index - gap) > 0) && ((compare(array, index, (index - gap), sortStat)) > 0)) {
                        swap(array, index, (index - gap), sortStat);
                    }
                }
            }
        }
        InsertionSorter sort = new InsertionSorter();
        sort.sort(sortedArray);
        for (int i = 0; i < array.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
}
