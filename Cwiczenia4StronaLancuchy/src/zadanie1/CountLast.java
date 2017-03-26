package zadanie1;

import java.util.Scanner;

public class CountLast {

	public static void main(String[] args){
		System.out.print("podaj ciąg znaków: ");
		Scanner in = new Scanner(System.in);
		String a=in.nextLine();
		in.close();
		char last= a.charAt(a.length()-1);
		int counter = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==last){
				counter++;
			}
		}
		System.out.println(counter);
	}
}
