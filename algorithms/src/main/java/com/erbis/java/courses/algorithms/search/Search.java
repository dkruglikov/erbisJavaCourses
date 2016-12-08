package com.erbis.java.courses.algorithms.search;

public class Search {

	public static final int RESULT_ELEMENT_NOT_FOUND = -1;

	private Search() {
	}

	public static int search(byte[] arrSrch, byte search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static int search(short[] arrSrch, short search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static int search(int[] arrSrch, int search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static int search(long[] arrSrch, long search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static int search(char[] arrSrch, char search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static int search(float[] arrSrch, float search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static int search(double[] arrSrch, double search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static byte min(byte[] arrMin) {
		byte minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static short min(short[] arrMin) {
		short minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static int min(int[] arrMin) {
		int minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static long min(long[] arrMin) {
		long minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static char min(char[] arrMin) {
		char minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static float min(float[] arrMin) {
		float minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static double min(double[] arrMin) {
		double minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static byte max(byte[] arrMax) {
		byte maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static short max(short[] arrMax) {
		short maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static int max(int[] arrMax) {
		int maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static long max(long[] arrMax) {
		long maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static char max(char[] arrMax) {
		char maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static float max(float[] arrMax) {
		float maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static double max(double[] arrMax) {
		double maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static double avg(byte[] arrAvg) {
		long summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

	public static double avg(short[] arrAvg) {
		long summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

	public static double avg(int[] arrAvg) {
		double summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

	public static double avg(long[] arrAvg) {
		long summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

	public static double avg(char[] arrAvg) {
		long summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

	public static double avg(float[] arrAvg) {
		double summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

	public static double avg(double[] arrAvg) {
		double summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}

}
