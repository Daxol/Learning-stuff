package zadanie1;

import java.util.Random;

public class Tablice1 {

	public static void main(String[] args) {

		int[] arrayInt = new int[10];

		Random rand = new Random();
		int temp;
		int sum = 0;

		for (int i = 0; i < arrayInt.length; i++) {
			temp = rand.nextInt(21) - 10;
			arrayInt[i] = temp;
			sum += temp;
		}

		int counterLower = 0;
		int counterHigher = 0;

		int max = arrayInt[0];
		int min = arrayInt[0];

		for (int var : arrayInt) {
			System.out.print(var + ", ");
			if (var > max) {
				max = var;
			} else if (var < min) {
				min = var;
			}

			if (var > sum / 10.0) {
				counterHigher++;
			} else if (var < sum / 10.0) {
				counterLower++;
			}

		}

		System.out.printf(
				"największy element: %d, najmniejszy: %d, średnia: %.2f, %d elementów jest większych od średniej, "
						+ " %d elementów jest mniejszych od średniej. \n ",
				max, min, sum / 10f, counterHigher, counterLower);
		reverse(arrayInt);
	}

	public static void reverse(int[] tab) {

		try {

			int temp;
			for (int i = 0; i < tab.length / 2; i++) {
				temp = tab[i];
				tab[i] = tab[tab.length - i - 1];
				tab[tab.length - i - 1] = temp;
			}

			for (int var : tab) {
				System.out.print(var + ", ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
