package zadanie9;

import java.util.Scanner;

public class Macierz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj rozmiar macierzy: ");
		int size = in.nextInt();
		in.close();
		boolean[][] arrayBool = new boolean[size][size];

		for (int i = 0; i < arrayBool.length; i++) {
			for (int j = 0; j < arrayBool.length; j++) {
				if (cos(i + 1, j + 1)) {
					arrayBool[i][j] = true;
				}
			}
		}

		for (int i = 0; i < arrayBool.length + 1; i++) {
			for (int j = 0; j < arrayBool.length + 1; j++) {
				if (j == 0 && i == 0) {
					System.out.printf("%-4c", ' ');
				} else if (i == 0) {
					System.out.printf("%-4d", j);
				} else if (j == 0) {
					System.out.printf("%-4d", i);
				} else if (arrayBool[i - 1][j - 1] == true) {
					System.out.printf("%-4c", '.');
				} else {
					System.out.printf("%-4c", '+');
				}
			}
			System.out.println();
		}
	}

	public static boolean cos(int number, int number2) {
		if (number == 1 && number2 == 1) {
			return false;
		}
		boolean stop = true;
		while (stop) {
			if (number == number2) {
				return true;
			} else if (number > number2) {
				number -= number2;
			} else if (number < number2) {
				number2 -= number;
			}
			if (number <= 1 || number2 <= 1) {
				stop = false;
			}
		}
		return false;
	}
}