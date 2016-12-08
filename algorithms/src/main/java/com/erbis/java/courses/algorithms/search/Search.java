package com.erbis.java.courses.algorithms.search;

import java.util.NoSuchElementException;

public class Search {
	public static final int RESULT_ELEMENT_NOT_FOUND = -1;

	private Search() {
	}

	public static int search(byte[] array, byte value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static int search(short[] array, short value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static int search(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static int search(long[] array, long value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static int search(char[] array, char value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static int search(float[] array, float value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static int search(double[] array, double value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		throw new NoSuchElementException();
	}

	public static byte min(byte[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
		
	}

	public static short min(short[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
	}

	public static int min(int[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
	}

	public static long min(long[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
	}

	public static char min(char[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
	}

	public static float min(float[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
	}

	public static double min(double[] array) {
		int iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		return array[iMin];
	}

	public static byte max(byte[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static short max(short[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static int max(int[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static long max(long[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static char max(char[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static float max(float[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static double max(double[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		return array[iMax];
	}

	public static double avg(byte[] array) {
		throw new UnsupportedOperationException();
	}

	public static double avg(short[] array) {
		throw new UnsupportedOperationException();
	}

	public static double avg(int[] array) {
		throw new UnsupportedOperationException();
	}

	public static double avg(long[] array) {
		throw new UnsupportedOperationException();
	}

	public static double avg(char[] array) {
		throw new UnsupportedOperationException();
	}

	public static double avg(float[] array) {
		throw new UnsupportedOperationException();
	}

	public static double avg(double[] array) {
		throw new UnsupportedOperationException();
	}
}
