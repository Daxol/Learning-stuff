package zadanie4;

import java.util.Scanner;

public class ZmBinaryConvert {

	public static void main(String[] args) {

		int[] binnaryArray = new int[32];
		System.out.println("podaj liczbę ");
		Scanner in = new Scanner(System.in);

		try {
			int binValue = in.nextInt();

			int counter = 0;
			String binaryCodeString = "";
			if (binValue < 0) {
				binaryCodeString += "1.";
				binValue *= (-1);
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
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
