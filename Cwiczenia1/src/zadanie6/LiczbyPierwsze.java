package zadanie6;

import java.util.Scanner;

public class LiczbyPierwsze {

	public static void main(String[] args){
		System.out.print("podaj liczbę: ");
		boolean primeNumber = true;
		int number;
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		
		for (int i = 2; i < number; i++) {
			if(number != i && number % i ==0){
				primeNumber = false;
			}
		}
		System.out.println("liczba pierwsza? "+primeNumber);
		in.close();
	}
}
