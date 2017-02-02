package com.erbis.java.courses.algorithms.sort;

public class ShellSort extends InsertionSorter {

    @Override
    public SortStat sort(int[] array) {
        int[] sortedArray = array;
        SortStat sortStat = new SortStat();
        for (int gap = (array.length) / 2; gap > 0; gap /= 2) {
            for (int index = 0; index < ((array.length) - gap); index++) {
                if ((compare(array, index, (index+gap), sortStat)) > 0) {
                    swap(array, index, (index+gap), sortStat);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(sortedArray[i]);
        }
        return sortStat;
    }
}
