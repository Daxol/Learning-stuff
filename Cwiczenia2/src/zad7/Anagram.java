package zad7;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("aaa", "aaa"));
	}

	public static boolean isAnagram(String first, String second) {
		first = first.trim();
		first = first.toLowerCase();
		second = second.trim();
		second = second.toLowerCase();

		char[] firstString = first.toCharArray();
		Arrays.sort(firstString);
		String firstSorted = firstString.toString();
		
		char[] secondString = second.toCharArray();
		secondString = second.toCharArray();
		Arrays.sort(secondString);
		String secondSorted = secondString.toString();
		
		if (firstSorted.equals(secondSorted)) {
			return true;
		} else {
			return false;
		}
	}
}
