package zadanie1;

import java.util.Scanner;

public class tempApp {

	public static void main(String[] args) {
		byte tempC;
		Scanner in = new Scanner(System.in);
		System.out.println("podaj temperture w st. C");
		try {
			tempC = in.nextByte();
			informationAboutTemp(tempC);
			in.close();
		} catch (Exception e) {
			System.err.println(e.getMessage() + " podano błędną temp ");

		}
	}

	private static void informationAboutTemp(byte tempC) {
		float tempF;
		tempF = tempC * (9f / 5f) + 32;

		if (tempC < 0) {
			System.out.format("%.2f st. F, zimno - poniżej 0 st. C następny poziom za +%d st. C", tempF, tempC *= (-1));
		} else if (tempC >= 0 && tempC < 10) {
			System.out.format("%.2f st. F, chłodno - poniżej 10 st. C następny poziom za +%d st. C", tempF, 10 - tempC);
		} else if (tempC >= 10 && tempC < 25) {
			System.out.format("%.2f st. F, ciepło - poniżej 25 st. C, następny poziom za +%d st. C", tempF, 25 - tempC);
		} else {
			System.out.format("%.2f st. F, gorąco - nie mniej, niż 25 st. C jest to najwyższy poziom", tempF);
		}

	}
}
