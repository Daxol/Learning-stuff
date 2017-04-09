package strona1.zad1;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("podaj dolny przedział ");
		int x = in.nextInt();
		System.out.println("podaj górny przedział ");
		int y = in.nextInt();

		in.close();
		for (int i = x; i <= y; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			} else if (i % 7 == 0) {
				System.out.print(i + " ");
			} else if (i % 11 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
