package zad7Dom;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("Daniel","Leinad"));
	}

	public static boolean isAnagram(String firstStr, String secondStr) {
		firstStr = firstStr.trim().toLowerCase();
		secondStr = secondStr.trim().toLowerCase();

		char[] firstChars = firstStr.toCharArray();
		char[] secondChars = secondStr.toCharArray();
		Arrays.sort(firstChars);
		Arrays.sort(secondChars);
		
		return Arrays.equals(firstChars,secondChars);
	}
}
