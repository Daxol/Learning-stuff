package zadanie2;

import java.util.Scanner;

public class PodatekDochodowy {

	public static void main(String[] args) {
		double taxAmount;

		Scanner in = new Scanner(System.in);

		System.out.println("podaj dochód ");
		{
			taxAmount = in.nextDouble();
			try {
				if (taxAmount < 85528) {
					taxAmount = ((taxAmount - 556.02) - ((taxAmount) * 0.82));
					System.out.printf("podatek wynosi 18%% podstawy minus 556,02zl  %.2fzł ", taxAmount);
				} else {
					taxAmount = 14839.02 + (0.32 * (taxAmount - 85528));
					System.out.printf("podatek wynosi 14839,02zł + 32%% nadwyżki ponad 85528,00zł : %.2fzł", taxAmount);
				}
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
