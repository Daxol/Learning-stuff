package zadanie1;

import java.util.Random;

public class RandomOneHundred {

	public static void main(String[] args) {

		Random rand = new Random();
		int temp;
		int counterEven = 0;
		int counterOdd = 0;

		int sumEven = 0;
		int sumOdd = 0;

		int maxOne = -1;
		int maxTwo = -1;
		int maxThree = -1;

		for (int i = 0; i < 100; i++) {
			temp = rand.nextInt(201) - 100;

			if (temp % 2 == 0) {
				counterEven++;
				sumEven += temp;
			} else {
				counterOdd++;
				sumOdd += temp;
			}
			if (temp > maxThree && temp > 0) {
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
			double averageOdd = (double) sumOdd / counterOdd;
			double averageEven = (double) sumEven / counterEven;
			System.out.printf("stosunek średniej wylosowanych liczb parzystych do nieparzystych to %.3f ",
					(averageEven / averageOdd));
			System.out.printf("natomiast trzy największe liczby to %d, %d, %d", maxOne, maxTwo, maxThree);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}