package zadanie2Fibon;

import java.util.Scanner;

public class Fibon {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int value;
		do {
			System.out.println("podaj liczbę dodatnią : ");
			value = in.nextInt();
		} while (value < 0);
		in.close();
		System.out.println(fibon(value));
	}

	public static int fibon(int a) {
		if (a == 0)
			return 0;
		else if (a == 1)
			return 1;
		else {
			return fibon(a - 2) + fibon(a - 1);
		}
	}
}
