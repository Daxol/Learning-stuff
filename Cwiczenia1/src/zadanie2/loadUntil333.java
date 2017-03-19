package zadanie2;

import java.util.Scanner;

public class loadUntil333 {

	public static void main(String[] args) {
		int evenNumberCounter = 0;
		int loadedNumber = 0;
		int oddNumberCounter = 0;
		int oddSum = 0;

		System.out.println("podaj liczby: ");
		Scanner in = new Scanner(System.in);
		while (loadedNumber != 333) {
			try {
				loadedNumber = in.nextInt();
				if (loadedNumber % 2 == 0) {
					evenNumberCounter++;
				} else {
					if (loadedNumber % 5 == 0) {
						oddSum += loadedNumber;
						oddNumberCounter++;
					}

				}
			} catch (Exception e) {
				System.err.println(e.getMessage() + " podano błędne dane!");
			}
		}
		in.close();
		System.out.format(
				"Wynik: \nśrednia arytmetyczna licz nieparzystych"
						+ " podzielnych przez 5 %.2f \nilość liczb parzystych %d",
				(float) oddSum / oddNumberCounter, evenNumberCounter);

	}

}
