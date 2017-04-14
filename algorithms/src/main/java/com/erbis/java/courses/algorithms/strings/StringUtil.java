package com.erbis.java.courses.algorithms.strings;

public final class StringUtil {

    private StringUtil() {
    }

    public static char getMostRepeatableChar(String s) {
        char mostRepeatableChar = s.charAt(0);
        int count = 1;
        for (int index = 1; index < s.length(); index++) {
            char currentChar = (s.charAt(index));
            if (currentChar == mostRepeatableChar) {
                mostRepeatableChar = currentChar;
                count++;
            } else {
                mostRepeatableChar = s.charAt(index);
            }
        }
        return mostRepeatableChar;
    }

    public static int getCharCount(String s) {
        int count = 0;
        for (int index = 0; index < s.length(); index++) {
            s.charAt(index);
            count++;
        }
        return count;
    }

    public static String getLongestWord(String s) {
        String longestWord = "";
        int count = 0;
        String currentWord = "";
        int count2 = 0;
        for (int index = 0; index < getCharCount(s); index++) {
            if (s.charAt(index) != ' ') {
                currentWord = currentWord + s.charAt(index);
                count2++;
            }
            if (s.charAt(index) == ' ') {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                    currentWord = "";
                    count = count2;
                    count2 = 0;
                } else {
                    currentWord = "";
                }
            }
            if (index == (getCharCount(s) - 1)) {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
            }
        }
        return longestWord;
    }

    public static char getLastChar(String s) {
        char lastChar = 'a';
        for (int index = 0; index < s.length(); index++) {
            lastChar = s.charAt(index);
        }
        return lastChar;
    }
}