package com.erbis.java.courses.algorithms.search;

public class Search {

    public static final int RESULT_ELEMENT_NOT_FOUND = -1;

    public Search() {
        }

    public static int search(byte[] array, byte value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
        }
        return index;
    }

    public static int search(short[] array, short value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
        }
        return index;
    }

    public static int search(int[] array, int value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
            if ((array.length == (index-1))&&(array[index] != value)) {
                return RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return index;
    }

    public static int search(long[] array, long value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
            if ((array.length == (index-1))&&(array[index] != value)) {
                return RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return index;
    }

    public static int search(char[] array, char value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
            if ((array.length == (index-1))&&(array[index] != value)) {
                return RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return index;
    }

    public static int search(float[] array, float value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
            if ((array.length == (index-1))&&(array[index] != value)) {
                return RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return index;
    }

    public static int search(double[] array, double value) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
            if ((array.length == (index-1))&&(array[index] != value)) {
                return RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return index;
    }

    public static byte min(byte[] array) {
        byte minValue = 0;
        for (int index = 0; index < array.length; index++) {
            minValue = array[index];
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static short min(short[] array) {
        short minValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static int min(int[] array) {
        int minValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static long min(long[] array) {
        long minValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static char min(char[] array) {
        char minValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static float min(float[] array) {
        float minValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static double min(double[] array) {
        double minValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static byte max(byte[] array) {
        byte maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static short max(short[] array) {
        short maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static int max(int[] array) {
        int maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static long max(long[] array) {
        long maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static char max(char[] array) {
        char maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static float max(float[] array) {
        float maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static double max(double[] array) {
        double maxValue = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static double avg(byte[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum/(array.length);
    }

    public static double avg(short[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum= sum + array[index];
        }
        return sum/(array.length);
    }

    public static double avg(int[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum/(array.length);
    }

    public static double avg(long[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum/(array.length);
    }

    public static double avg(char[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum/(array.length);
    }

    public static double avg(float[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum/(array.length);
    }

    public static double avg(double[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum/(array.length);
    }
}
