package zadanie4;

import java.util.Scanner;

public class UntilZero {

	public static void main(String[] args){
		int sum=0;
		int tempValue=1;
		
		Scanner in = new Scanner(System.in);
		while(tempValue!=0){
			System.out.println("podaj liczbę ");
			tempValue = in.nextInt();
			sum += tempValue;
		}
		in.close();
		System.out.println("suma: "+sum);
	}
}
