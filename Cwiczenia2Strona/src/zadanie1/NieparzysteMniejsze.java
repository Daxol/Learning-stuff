package zadanie1;

import java.util.Scanner;

public class NieparzysteMniejsze {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int inputVar;
		System.out.println("podaj liczbę całkowitą dodatnią");
		try {
			inputVar = in.nextInt();
			if (inputVar < 0) {
				System.out.println("podałeś błędną liczbę ");
			} else {
				for (int i = 0; i < inputVar; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		in.close();
	}
}
