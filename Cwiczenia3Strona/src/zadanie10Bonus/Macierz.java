package zadanie10Bonus;

import java.util.Random;
import java.util.Scanner;

public class Macierz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("podaj wielkość tablic: ");
		int size = in.nextInt();
		System.out.print("\npodaj pierwszą wartosć: ");
		int firstArg = in.nextInt();
		System.out.print("\npodaj drugą wartość: ");
		int secondArg = in.nextInt();
		in.close();
		int tempRand;
		boolean[][] boolArray = new boolean[size][size];
		Random rand = new Random();
		for (int i = 0; i < boolArray.length; i++) {
			for (int j = 0; j < boolArray.length; j++) {
				tempRand=rand.nextInt(2);
				if(tempRand==1)
					boolArray[i][j]=true;
			}
		}
		int[][] intArray = new int[size][size];
		cos(intArray, boolArray, firstArg, secondArg);

	}

	public static void cos(int[][] intArray, boolean[][] boolArray, int firstArg, int secondArg) {
		int counterArgFirst = 0;
		int counterArgSecond = 0;
		float sumMinus = 0;
		float sumPlus = 0;
		int sumBool = 0;
		int randTemp = 0;
		Random rand = new Random();
		for (int i = 0; i < boolArray.length; i++) {

			for (int j = 0; j < boolArray.length; j++) {
				if (i == j) {
					randTemp = rand.nextInt(100) + 1;
					if (randTemp < 25) {
						if (sumPlus / i < 0.75) {
							System.out.printf("%4d", -1);
							intArray[i][j] = -1;
							sumPlus++;
						} else {
							sumMinus++;
							System.out.printf("%4d", 1);
							intArray[i][j] = 1;
						}
					} else {
						if (sumMinus / i < 0.25) {
							System.out.printf("%4d", 1);
							intArray[i][j] = 1;
							sumMinus++;
						} else {
							System.out.printf("%4d", -1);
							intArray[i][j] = -1;
						}
					}

				} else {
					randTemp = rand.nextInt(301) - 100;
					System.out.printf("%4d", randTemp);
					intArray[i][j] = randTemp;
				}
				if (intArray[i][j] == firstArg) {
					counterArgFirst += 1;
				} else if (intArray[i][j] == secondArg) {

					counterArgSecond += 1;
				}
				if (boolArray[i][j] == true) {
					sumBool += intArray[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("liczba komórek odpowiadających podanym parametrom: " + (counterArgFirst + counterArgSecond));
		System.out.println("suma wartości odpowiadającym komórkom true: " + sumBool);
		System.out.println((counterArgFirst + counterArgSecond) / (float) sumBool);
	}
}
