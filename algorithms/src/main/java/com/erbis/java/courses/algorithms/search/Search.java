package com.erbis.java.courses.algorithms.search;

public final class Search {

    public static final int RESULT_ELEMENT_NOT_FOUND = -1;

    public Search() {
    }

    public static int search(byte[] array, byte value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static int search(short[] array, short value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static int search(int[] array, int value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static int search(long[] array, long value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static int search(char[] array, char value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static int search(float[] array, float value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static int search(double[] array, double value) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                number = index;
                break;
            }
            if (array[array.length - 1] != value) {
                number = RESULT_ELEMENT_NOT_FOUND;
            }
        }
        return number;
    }

    public static byte min(byte[] array) {
        byte minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static short min(short[] array) {
        short minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static long min(long[] array) {
        long minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static char min(char[] array) {
        char minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static float min(float[] array) {
        float minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static double min(double[] array) {
        double minValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        return minValue;
    }

    public static byte max(byte[] array) {
        byte maxValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static short max(short[] array) {
        short maxValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static long max(long[] array) {
        long maxValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static char max(char[] array) {
        char maxValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static float max(float[] array) {
        float maxValue = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public static double max(double[] array) {
        double maxValue = array[0];
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
        return sum / (array.length);
    }

    public static double avg(short[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum / (array.length);
    }

    public static double avg(int[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum / (array.length);
    }

    public static double avg(long[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum / (array.length);
    }

    public static double avg(char[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum / (array.length);
    }

    public static double avg(float[] array) {
        double sum = 0F;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum / (array.length);
    }

    public static double avg(double[] array) {
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum / (array.length);
    }
}
