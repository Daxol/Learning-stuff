package zadanie4FlipCase;

import java.util.Scanner;

public class FlipCase {

	public static void main(String[] args) {
		System.out.println("podaj zdanie: ");

		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		in.close();
		String flipString = "";

		for (int i = 0; i < userString.length(); i++) {
			if (Character.isUpperCase(userString.charAt(i))) {
				flipString += Character.toLowerCase(userString.charAt(i));
			} else if (!Character.isUpperCase(userString.charAt(i))) {
				flipString += Character.toUpperCase(userString.charAt(i));
			} else {
				flipString += userString.charAt(i);
			}
		}
		System.out.println(userString);
		System.out.println(flipString);
	}
}