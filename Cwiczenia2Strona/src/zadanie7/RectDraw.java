package zadanie7;

import java.util.Scanner;

public class RectDraw {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("podaj znak wypełnienia");
		char symbol;
		symbol = in.next().charAt(0);
		System.out.print("podaj pozycje x: ");
		int xPos = in.nextInt();
		System.out.print("podaj pozycje y: ");
		int yPos = in.nextInt();
		System.out.print("podaj długość a: ");
		int aDistance = in.nextInt();
		System.out.print("podaj długość b: ");
		int bDistance = in.nextInt();
		in.close();
		
		for (int i = 1; i < aDistance + yPos; i++) {
			for (int j = 1; j < bDistance + xPos; j++) {
				if (i >= yPos && j >= xPos) {
					System.out.print(symbol);
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}
