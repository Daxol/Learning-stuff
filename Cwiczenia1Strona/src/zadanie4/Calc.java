package zadanie4;

import java.util.Scanner;

public class Calc {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Kalkulator - możliwe obliczenia dodawanie(+), odejmowanie(-), mnożenie(*)"
				+ ", dzielenie(/), reszta z dzielenia(mod)");
		System.out.print("Podaj pierwszą liczbę: ");

		try {
			count(loadArg(), loadArg(), loadSymbol());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void count(double arg1, double arg2, String symbol) {
		switch (symbol) {
		case "+":
			System.out.println(arg1 + arg2);
			break;
		case "-":
			System.out.println(arg1 - arg2);
			break;
		case "/":
			if (arg2 == 0) {
				System.err.println("nie można dzielić przez zero! ");
			} else {
				System.out.println(arg1 / arg2);
			}
			break;
		case "*":
			System.out.println(arg1 * arg2);
			break;
		case "mod":
			System.out.println(arg1 % arg2);
			break;
		default:
			System.out.println("podano błędny operator, spróbuj ponownie");
			try {
				count(loadArg(), loadArg(), loadSymbol());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}

	}

	public static String loadSymbol() {
		System.out.println("Podaj symbol arytmetyczny: ");
		String arSymbol = in.next().toString();

		return arSymbol;
	}

	public static double loadArg() {
		double argValue;
		System.out.print("podaj liczbę: ");
		try {
			argValue = in.nextDouble();

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("podano błędną liczbę");
			argValue = 0;
		}

		return argValue;
	}
}