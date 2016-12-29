package com.erbis.java.courses.algorithms.strings;

public final class StringUtil {
	
	private StringUtil() {
	}
	
	public static char getMostRepeatableChar(String s) {
		int[] counts = new int[65636];
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i)]++;
		}
		int index = -1;
		int max = 0;
		for (int i = 0; i < counts.length; i++) {
			if (max <= counts[i]) {
				max = counts[i];
				index = i;
			}
		}
		return (char) index;
	}
	
	public static int getCharCount(String s) {
		return s.length();
	}
	
	public static String getLongestWord(String s) {
		String[] words = s.split(" ");
		String longestWord = "";
		for (int i = 0; i < words.length; i++) {
			if (longestWord.length() < words[i].length()) {
				longestWord = words[i];
			}
		}
		
		return longestWord;
	}
	
	public static char getLastChar(String s) {
		char lastChar = s.charAt(s.length()-1);
		return lastChar;
	}
}
