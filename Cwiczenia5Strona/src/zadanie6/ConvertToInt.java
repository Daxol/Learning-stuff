package zadanie6;

import java.text.NumberFormat;
import java.util.Scanner;

public class ConvertToInt {

	public static void main(String[] args) {
		System.out.println("podaj liczbę: ");
		Scanner in = new Scanner(System.in);
		String stringNumber = in.next();
		System.out.println(strToInt(stringNumber));
	}

	public static int strToInt(String str) {
		String readyToParse = "";
		boolean isE = false;
		boolean isPlus = false;
		boolean contin = true;
		for (int i = 0; i < str.length(); i++) {
			if (contin && Character.isDigit(str.charAt(i))
					|| (str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == '+' || str.charAt(i) == '-')) {
				if (str.charAt(i) == '-' &&)) {
					if (i == 0 && Character.isDigit(str.charAt(i+1)))
						readyToParse += '-';
					else
						contin = false;
					System.err.println("start");

				} else if ((str.charAt(i) == 'e' || str.charAt(i) == 'E')) {
					if (isE && !Character.isDigit(str.charAt(i+1)))
						contin = false;
					else {
						isE = true;
						readyToParse += str.charAt(i);
					}
				}

				else if ((str.charAt(i) == '+')) {
					if (isPlus && (str.charAt(i - 1) != 'e' || str.charAt(i - 1) != 'E'))
						contin = false;
					else {
						isPlus = true;
						readyToParse += str.charAt(i);
					}
				} else if (Character.isDigit(str.charAt(i))) {
					readyToParse += str.charAt(i);
					System.err.println("is digit");
				}

			} else {
				contin = false;
				break;
			}
		}
		
		try {
			NumberFormat f = NumberFormat.getInstance();
			f.setGroupingUsed(false);
			return (int)Double.parseDouble(readyToParse);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

}
