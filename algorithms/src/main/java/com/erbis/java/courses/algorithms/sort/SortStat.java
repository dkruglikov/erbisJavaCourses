package com.erbis.java.courses.algorithms.sort;

public final class SortStat {
	
	private int size;
	private int comparisons;
	private int swaps;
	private long time;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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
