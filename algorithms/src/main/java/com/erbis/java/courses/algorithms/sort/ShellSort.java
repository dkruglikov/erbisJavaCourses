package com.erbis.java.courses.algorithms.sort;

public class ShellSort extends InsertionSorter {

    @Override
    protected void sort(int[] array, SortStat sortStat) {
        for (int gap = (array.length) / 2; gap > 1; gap /= 2) {
            for (int index = 0; index < (array.length - gap); index++) {
                if ((compare(array, index, (index + gap), sortStat)) > 0) {
                    swap(array, index, (index + gap), sortStat);
                    while (((index - gap) > 0)
                            && ((compare(array, index, (index - gap), sortStat))
                            > 0)) {
                        swap(array, index, (index - gap), sortStat);
                    }
                }
            }
        }
        super.sort(array, sortStat);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
