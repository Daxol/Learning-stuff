package strona1.zad5;

import java.util.Random;
import java.util.Scanner;

public class TooLowTooHigh {

	public static void main(String[] args){
		
		int number;
		Random rand = new Random();
		number = rand.nextInt(101);
		
		System.out.println("podaj liczbę pomiędzy 0 a 100");
		int userNumber;
		Scanner in = new Scanner(System.in);
		
		while((userNumber=in.nextInt())!=number){
			if(userNumber>number){
				System.out.println("za dużo");
			}
			else if(userNumber<number){
				System.out.println("za mało");
			}
		}
		in.close();
		System.out.println("gratuluje trafiles");
	}
}
