package zadanie1;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args){
		int weight;
		float height;
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj wagę: ");
		weight = in.nextInt();
		System.out.println("Podaj wzrost w cm: ");
		height = in.nextFloat();		
		height = height/100;
		in.close();
		float bmi = (float) (weight/(Math.pow(height, 2)));
		
		if(bmi<18.5){
			System.out.print("niedowaga ");
		}
		else if(bmi<= 24.9 && bmi >=18.5){
			System.out.print("waga prawidlowa ");
		}
		else{
			System.out.print("nadwaga ");
		}
		System.out.printf("wskaźnik bmi: %.2f",bmi);
	}
}
