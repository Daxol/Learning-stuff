package zad1;

import java.util.Random;

public class MyClass {

	public static void main(String[] args) {

		int maxOne = -1;
		int maxTwo = -1;
		int maxThree = -1;
		int temp;
		int counterOdd = 0;
		int sumOdd = 0;
		int counterEven = 0;
		int sumEven = 0;
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			temp = rand.nextInt(201) - 100;

			if (temp % 2 == 0) {

				counterEven++;
				sumEven += temp;
			} else {
				counterOdd++;
				sumOdd += temp;
			}

			if (temp > maxThree) {
				if (temp > maxTwo) {
					if (temp > maxOne) {
						maxThree = maxTwo;
						maxTwo = maxOne;
						maxOne = temp;
					} else {
						maxThree = maxTwo;
						maxTwo = temp;
					}
				} else {
					maxThree = temp;
				}
			}
		}
		try {
			float average = ((float) sumEven / counterEven) / ((float) sumOdd / counterOdd);
			System.out.printf("stosunek parzystych do nieparzystych to %.3f \n", average);

		} catch (ArithmeticException e) {
			System.out.println("dzielenie przez 0");
		}
		if (maxThree != -1) {
			System.out.printf("pierwsza największa liczba %d, druga %d, trzecia %d ", maxOne, maxTwo, maxThree);
		}
		else{
			System.out.println("w wylosowanym zbiorze nie było trzech dodatnich liczb");
		}
	}

}
