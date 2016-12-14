package com.erbis.java.courses.algorithms.search;

public final class Search {
	public static final int RESULT_ELEMENT_NOT_FOUND = -1;

	private Search() {
	}

	public static int search(byte[] array, byte value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int search(short[] array, short value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int search(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int search(long[] array, long value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int search(char[] array, char value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int search(float[] array, float value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int search(double[] array, double value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static byte min(byte[] array) {
		byte min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
		
	}

	public static short min(short[] array) {
		short min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static long min(long[] array) {
		long min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static char min(char[] array) {
		char min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static float min(float[] array) {
		float min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static byte max(byte[] array) {
		byte max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static short max(short[] array) {
		short max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static long max(long[] array) {
		long max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static char max(char[] array) {
		char max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static float max(float[] array) {
		float max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double max(double[] array) {
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double avg(byte[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		return avg;
	}

	public static double avg(short[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		return avg;
	}

	public static double avg(int[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		return avg;
	}

	public static double avg(long[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		return avg;
	}

	public static double avg(char[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		avg = sum/array.length;
		return avg;
	}

	public static double avg(float[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		return avg;
	}

	public static double avg(double[] array) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		return avg;
	}
}
