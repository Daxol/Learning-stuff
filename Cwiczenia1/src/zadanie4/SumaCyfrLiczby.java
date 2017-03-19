package zadanie4;

import java.util.Scanner;

public class SumaCyfrLiczby {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.print("podaj liczbę: ");

		number = in.nextInt();
		System.out.println(modulo(number) + " suma cyfr liczby");
		in.close();
	}

	private static int modulo(int number) {
		int sum = 0;
		int evenNumberCounter = 0;
		int evenNumberSum = 0;
		int oddNumberCounter = 0;
		int oddNumberSum = 0;
		while (number != 0) {
			System.out.println("suma cyfr: " + sum + "  liczba: " + number);
			if (number % 2 == 0) {
				evenNumberCounter++;
				evenNumberSum += number % 10;
			} else {
				oddNumberCounter++;
				oddNumberSum +=number % 10;
			}
			sum += number % 10;
			number = number / 10;
		}

		System.out.println(" even number and sum: "+evenNumberCounter+" "+evenNumberSum);
		System.out.println(" odd number and sum:  "+oddNumberCounter+" "+oddNumberSum);
		return sum;
	}
}
