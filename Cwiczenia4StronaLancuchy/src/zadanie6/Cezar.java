package zadanie6;

import java.util.Scanner;

public class Cezar {

	public static void main(String[] args) {
		System.out.println("podaj tekst do zaszyfrowania");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		in.close();
		System.out.println("o ile przesunąć? ");
		int n = in.nextInt();
		char temp;

		for (int i = 0; i < userString.length(); i++) {
			temp = userString.charAt(i);
			if (temp >= 'a' && temp <= 'z') {
				temp = (char) (temp + n);
				if (temp < 'a') {
					temp += 26;
				}

				else if (temp > 'z') {
					temp -= 26;
				}
			}
			System.out.print(temp);
		}
	}
}
