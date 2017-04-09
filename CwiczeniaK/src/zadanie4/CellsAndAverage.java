package zadanie4;

import java.util.Scanner;

public class CellsAndAverage {

	public static void main(String[] args) {
		countCells("Ola");
	}

	private static void countCells(String str) {
		String[] myArray = new String[str.length()];
		String[] tempArray;
		System.out.printf("podaj %d zdań \n", str.length());
		int strSum = 0;
		int cellsCounter = 0;
		String tempStr;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < str.length(); i++) {
			tempStr = in.nextLine();
			strSum += tempStr.length();
			myArray[i]=tempStr;
			
			tempArray = tempStr.split(" ");
			if (tempArray[0].equals(str)) {
				cellsCounter++;
			}
		}
		in.close();
		
		System.out.printf("liczba komórek %d ", cellsCounter);
		System.out.printf("średnia %.3f", (float) strSum / str.length());
	}

}