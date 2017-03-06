package com.erbis.java.courses.algorithms.sort;

public class SortStat {
	
	private final int size;
	private int comparisons;
	private int swaps;
	private long time;

	public SortStat(int size) {
		this.size=size;
	}

	public int getSize() {
		return size;
	}

	public int getComparisons() {
		return comparisons;
	}

	public void increaseComparisons() {
		comparisons++;
	}

	public int getSwaps() {
		return swaps;
	}

	public void increaseSwaps() {
		swaps++;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}
