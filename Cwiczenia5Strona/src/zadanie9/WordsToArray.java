package zadanie9;

import java.util.Scanner;

public class WordsToArray {

	public static void main(String[] args) {
		System.out.println("podaj zdanie: ");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		in.close();

		for (String string : podzielNaSlowa(userString)) {
			System.out.println(string);
		}

	}

	public static String[] podzielNaSlowa(String userString) {

		String trim = userString.trim();
		if (trim.isEmpty()) {
			String[] tab = {};
			return tab;
		} else {
			String[] tab = trim.split("\\s+");
			return tab;
		}
	}
}
