package zadanie6;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int wantedValue = rand.nextInt(100) + 1;

		int counter = 0;
		int userValue = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("podaj liczbę ");
		while (userValue != wantedValue) {
			userValue = in.nextInt();
			counter++;
			if (userValue < wantedValue) {
				System.out.println("twoja liczba jest za mała, spróbuj ponownie ");
			} else if (userValue > wantedValue) {
				System.out.println("twoja liczba jest za duża, spróbuj ponownie ");
			} else {
				System.out.printf("Gratuluje trafiłeś za %d razem", counter);
			}
		}
		in.close();
	}
}
