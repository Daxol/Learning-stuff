package zadanie2;

import java.util.Random;

public class NumberOfArgs {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arrayInt = new int[20];
		int temp;
		int[] counterArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < arrayInt.length; i++) {
			temp = rand.nextInt(10) + 1;
			arrayInt[i] = temp;
			counterArray[temp - 1]++;
		}
		
		for (int var : arrayInt) {
			System.out.print(var + ", ");
		}
		
		System.out.println();
		for (int i = 0; i < counterArray.length; i++) {
			System.out.println(i + 1 + " - " + (counterArray[i]));
		}

	}
}
