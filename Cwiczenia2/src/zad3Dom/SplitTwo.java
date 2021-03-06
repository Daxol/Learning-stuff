package zad3Dom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SplitTwo {

	public static void main(String[] args) {
		String[] tab = { "a", " ", "c", "bv" };
		String words = "Ala ma kota co ma na imie kbvk";
		for (String string : split2(words, tab)) {
			System.out.print(string + " ");
		}
	}

	private static String[] split2(String str, String[] tStr) {
		String temp;
		StringBuilder sb = new StringBuilder();

		String[] array = str.split(tStr[0]);
		for (String string : array) {
			sb.append(string);
		}
		temp = sb.toString();
		sb = new StringBuilder();
		for (int i = 1; i < tStr.length; i++) {
			array = temp.split(tStr[i]);
			if (tStr.length - 1 == i) {
				return array;
			}
			for (String string : array) {
				sb.append(string);
			}

			temp = sb.toString();
			sb = new StringBuilder();
		}
		return array;
	}
}
