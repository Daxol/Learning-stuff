package zadanie3;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("podaj zdanie by sprawdzić czy jest palindromem: ");
		Scanner in = new Scanner(System.in);
		String palindrom = in.nextLine();
		in.close();
		String isPalindrom = "";

		try {
			palindrom = palindrom.replaceAll("\\s+", "").toLowerCase();
			for (int i = palindrom.length() - 1; i >= 0; i--) {
				isPalindrom += palindrom.charAt(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(palindrom);
		System.out.println(isPalindrom);

		System.out.println(palindrom.equals(isPalindrom));

	}
}
