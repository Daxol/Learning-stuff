package zadanie1Silnia;

import java.util.Scanner;

public class Silnia {
	public static void main(String[] args) {
		System.out.println("podaj liczbę: ");

		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		in.close();
		System.out.println(silnia(value));
		System.out.println(silniaTwo(value));

	}

	public static int silnia(int a) {
		if (a == 0)
			return 1;
		else if (a >= 1) {
			return a * silnia(a - 1);
		} else
			return 0;
	}

	public static int silniaTwo(int a) {
		if (a < 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += (a * (a - i));
			a -= i;
		}
		return sum;

	}
}
