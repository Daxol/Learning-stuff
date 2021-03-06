package zadanie2;

import java.util.Scanner;

public class Ciąg {

	public static void main(String[] args) {

		int lastIndex;
		int firstIndex;
		int temporaryValue;

		Scanner in = new Scanner(System.in);
		System.out.println("podaj pierwszą liczbę ");
		try {
			firstIndex = in.nextInt();
			System.out.println("podaj drugą liczbę ");
			lastIndex = in.nextInt();
			if (firstIndex > lastIndex) {
				temporaryValue = lastIndex;
				lastIndex = firstIndex;
				firstIndex = temporaryValue;
			}
			
			loops(firstIndex,lastIndex);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		in.close();
		
	}
	
	public static void loops(int firstArg, int secondArg){
		int sum=0;
		int counter=0;
		for (int i = firstArg; i <= secondArg ; i++) {
			sum +=i;
		}
		System.out.println("forLoop: "+sum);
		sum=0;
		counter = firstArg;
		do{
			sum += counter;
			counter++;
		}while(counter<=secondArg);
		counter=firstArg;
		System.out.println("do-while: " +sum);
		sum=0;
		while(counter<=secondArg){
			sum+=counter;
			counter++;
		}
		System.out.println("while: "+sum);
	}
}
