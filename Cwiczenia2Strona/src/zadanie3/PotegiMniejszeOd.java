package zadanie3;

import java.util.Scanner;

public class PotegiMniejszeOd {

	public static void main(String[] args){
		System.out.println("podaj liczbę: ");
		Scanner in = new Scanner(System.in);
		int varMax = in.nextInt();
		int pow=1;
		
		while (pow<=varMax) {
			System.out.println(pow);
			pow *=2;
		}
		in.close();
	}
}