package zad2;

import java.util.Random;

public class MyClass {

	public static void main(String[] args) {

		Byte[][] myArray = new Byte[40][40];

		Random rand = new Random();

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {

				if (i % 2 == 0) {
					myArray[i][j] = (byte) (i + j);
				} else {
					myArray[i][j] = (byte) ((byte) rand.nextInt(101) - 50);

				}

			}
		}

		Byte temp;
		try {
			for (int i = 0; i < myArray.length; i++) {
				for (int j = 0; j < myArray.length / 2; j++) {
					temp = myArray[i][j];
					myArray[i][j] = myArray[i][myArray[i].length - j - 1];
					myArray[i][myArray[i].length - j - 1] = temp;

				}
			}
		} catch (ArithmeticException exception) {
			System.out.println(exception.getMessage());
		}
		for (Byte[] bs : myArray) {
			for (Byte b : bs) {
				System.out.printf("%3d ", b);
			}
			System.out.println();
		}

	}

}