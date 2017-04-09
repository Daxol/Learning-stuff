package zadanie2;

import java.util.Random;

public class FillArray {

	public static void main(String[] args) {

		int[][] myArray = new int[40][40];
		Random rand = new Random();

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {

				if (i % 2 == 0) {
					myArray[i][j] = i + j;
				} else {
					myArray[i][j] = rand.nextInt(101) - 50;
				}
				System.out.print(myArray[i][j] + ", ");

			}
			System.out.println();
		}
		System.out.println();
		int temp;
		int length = myArray[0].length / 2;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < length; j++) {
				temp = myArray[i][j];
				myArray[i][j] = myArray[i][myArray[i].length - j - 1];
				myArray[i][myArray[i].length - j - 1] = temp;
			}
		}

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + ", ");

			}
			System.out.println();

		}

	}

}
