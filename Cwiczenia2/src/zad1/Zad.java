package zad1;

import java.util.Random;
import java.util.Scanner;

public class Zad {

	public static void main(String[] args) {
		Random rand = new Random();
		int size = rand.nextInt(51) + 50;
		while (size % 4 != 0) {
			size = rand.nextInt(51) + 50;
		}
		int temp = 1;
		int min;
		int max;
		System.out.println("podaj min i max");
		Scanner in = new Scanner(System.in);
		min = in.nextInt();
		max = in.nextInt();
		in.close();
		int sum=0;
		int[][] myArray = new int[size][size];

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {

				if (i == j) {
					temp = rand.nextInt(101);
					if (temp > 75) {
						myArray[i][j] = 1;
					} else {
						myArray[i][j] = -1;

					}

				} else {
					myArray[i][j] = rand.nextInt(min + 1) + max;

				}
				if(i*j > myArray[i][j]){
					sum++;
				}
			}
		}
		System.out.println("ilosc komorek "+sum);
	}
}
