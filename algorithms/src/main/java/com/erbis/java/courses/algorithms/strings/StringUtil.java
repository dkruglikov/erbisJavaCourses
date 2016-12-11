package com.erbis.java.courses.algorithms.strings;

public final class StringUtil {

	private StringUtil() {
	}

	public static char getMostRepeatableChar(String s) {
		int maxCounter = 1;
		char mostRepeatable = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			int counter = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					counter++;
				}
			}
			if (maxCounter < counter) {
				maxCounter = counter;
				mostRepeatable = s.charAt(i);
			}
		}
		return mostRepeatable;
	}

	public static int getCharCount(String s) {
		return s.length();
	}

	public static String getLongestWord(String s) {
		String longest = "";
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' || i == s.length() - 1) {
				if (word.length() > longest.length()) {
					longest = word;
				}
				word = "";
			} else {
				word += s.charAt(i);
			}
		}
		return longest;
	}

	public static char getLastChar(String s) {
		return s.charAt(s.length() - 1);
	}
}
