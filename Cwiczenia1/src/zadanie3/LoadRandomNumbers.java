package zadanie3;

import java.math.BigInteger;
import java.util.Random;

public class LoadRandomNumbers {

	public static void main(String[] args) {

		Random rand = new Random();
		byte randomNumber = 1;
		byte maxNumber = 0;
		byte maxNumberSmaller = 0;
		BigInteger ratioNumbers = new BigInteger("1");
		int counter = 0;
		int sumNumber = 0;

		while (randomNumber != 0) {
			counter++;
			randomNumber = (byte) (rand.nextInt(151) - 50);
			if (randomNumber > 0 && randomNumber % 2 == 0) {

				ratioNumbers = ratioNumbers.multiply(BigInteger.valueOf(randomNumber));
			}
			if (randomNumber > maxNumberSmaller) {
				if (randomNumber > maxNumber) {
					maxNumberSmaller = maxNumber;
					maxNumber = randomNumber;
				} else {
					maxNumberSmaller = randomNumber;
				}
			}
		}

		for (int i = 0; i < counter; i++) {
			randomNumber = (byte) (rand.nextInt(25) - 25);
			if (i % 2 == 0) {
				sumNumber += randomNumber;
			}
		}
		System.out.printf(
				"Największa liczbą z pierwszego losowania jest %d następna to %d iloczyn liczb parzystych: %d "
						+ " suma co drugiej liczby z drugiego losowania: %d",
				maxNumber, maxNumberSmaller, ratioNumbers, sumNumber);
	}
}
