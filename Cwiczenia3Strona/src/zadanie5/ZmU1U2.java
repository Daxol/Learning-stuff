package zadanie5;

import java.util.Scanner;

public class ZmU1U2 {
	public static void main(String[] args) {

		int[] binnaryArray = new int[32];
		System.out.println("podaj liczbę ");
		Scanner in = new Scanner(System.in);
		boolean minusValue = false;
		try {
			int binValue = in.nextInt();

			int counter = 0;
			String binaryCodeString = "";
			if (binValue < 0) {
				binaryCodeString += "1.";
				binValue *= (-1);
				minusValue = true;
			}
			for (int i = binnaryArray.length - 1; i >= 0; i--) {
				if (binValue > 0) {
					if (binValue % 2 != 0) {
						binnaryArray[i] = 1;
					}

					binValue /= 2;
					counter++;
				}

			}
			System.out.print(binaryCodeString);
			for (int i = binnaryArray.length - counter; i < binnaryArray.length; i++) {
				System.out.print(binnaryArray[i]);
			}
			System.out.println("\nZU1: ");
			{
				System.out.print(binaryCodeString);
				for (int i = binnaryArray.length - counter; i < binnaryArray.length; i++) {
					if (minusValue) {
						if (binnaryArray[i] == 1) {
							System.out.print(0);
						} else {
							System.out.print(1);
						}
					} else {
						System.out.print(binnaryArray[i]);

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}