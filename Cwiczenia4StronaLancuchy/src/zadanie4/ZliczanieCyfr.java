package zadanie4;

import java.util.Scanner;

public class ZliczanieCyfr {

	public static void main(String[] args){
		
		System.out.println("podaj tekst: ");
		String userString;
		Scanner in = new Scanner(System.in);
		userString = in.nextLine();
		in.close();
//		userString = " Ola 23 ma 1cos";
		int sum=0;
		
		
		for (int i = 0; i < userString.length(); i++) {
//			if(userString.charAt(i)>48 && userString.charAt(i)<58){
			if(userString.charAt(i)>='0' && userString.charAt(i)<='9'){

				sum+=(userString.charAt(i)-'0'); 
			}
		}
		
		System.out.println(sum);
	}
}
