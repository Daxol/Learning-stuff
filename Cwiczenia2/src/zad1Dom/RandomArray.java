package zad1Dom;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {

		Random rand = new Random();

		int size;
		while ((size = (rand.nextInt(100 - 50 + 1) + 50)) % 4 != 0) {
		}
		int[][] randomArray = new int[size][size];

		System.out.println("podaj a: ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("podaj b: ");
		int b = in.nextInt();
		in.close();
		int counter = 0;

		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				if (j != i) {
					if (a > b)
						randomArray[i][j] = rand.nextInt(a - b + 1) + b;
					else
						randomArray[i][j] = rand.nextInt(b - a + 1) + a;
				} else {
					randomArray[i][j] = (rand.nextInt(101) > 25) ? 1 : -1;
				}
				if (i * j > randomArray[i][j]) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
