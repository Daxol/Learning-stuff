package zadanie3;

import java.util.Scanner;

public class Raty {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		double prize;
		int part;
		try {
			part = getPart();
			prize = getPrize();
			System.out.printf("miesięczna rata przy cenie produktu %.2fzł i %d ratach wynosi %.2f", prize, part,
					getMonthFee(prize, part));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static double getMonthFee(double prize, int part) {
		double fee;
		if (part >= 6 && part <= 12) {
			fee = prize * 1.025;
			fee = fee / part;
		} else if (part >= 13 && part <= 24) {
			fee = prize * 1.05;
			fee = fee / part;
		} else {
			fee = prize * 1.1;
			fee = fee / part;
		}

		return fee;
	}

	public static double getPrize() {

		double prize;
		System.out.print("Podaj cene towaru: ");
		prize = in.nextDouble();

		while (prize < 100 || prize > 10000) {
			System.out.println("cena musi zaczynać się od 100zł, spróbuj ponownie: ");
			prize = in.nextDouble();
		}
		return prize;

	}

	public static int getPart() {
		int part;

		System.out.print("Podaj ilość rat: ");

		part = in.nextInt();
		while (part < 6 || part > 48) {
			System.out.println("ilość rat musi zawierać się od 6 do 48, spróbuj ponownie: ");
			part = in.nextInt();
		}

		return part;
	}
}
