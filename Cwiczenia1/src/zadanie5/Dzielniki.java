package zadanie5;

import java.util.Scanner;

public class Dzielniki {

	public static void main(String[] args) {

		int number;
		System.out.println("podaj liczbę");

		Scanner in = new Scanner(System.in);

		number = in.nextInt();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.println("dzielnik liczby " + number + " to " + i);
			}
		}
		in.close();
	}
}
