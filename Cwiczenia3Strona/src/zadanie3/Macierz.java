package zadanie3;

import java.util.Random;

public class Macierz {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] maxCol = new int[5];
		int[] minCol = new int[5];
		int[][] array = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = rand.nextInt(11) - 5;
				if (i == 0) {
					minCol[j] = array[i][j];
					maxCol[j] = array[i][j];
				}
				if (minCol[j] > array[i][j]) {
					minCol[j] = array[i][j];
				}
				if (maxCol[j] < array[i][j]) {
					maxCol[j] = array[i][j];
				}
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("minimalne wartości dla kolumn");
		for (int min : minCol) {
			System.out.printf("%3d ", min);
		}
		System.out.println("\n maksymalne warości dla kolumn");
		for (int max : maxCol) {
			System.out.printf("%3d ", max);
		}
	}
}
