package zadanie7;

import java.util.Scanner;

public class StrFind {

	public static void main(String[] args){
		System.out.println("podaj łańcuch znaków: ");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		System.out.println("podaj poszukiwany ciąg: ");
		String userWantedString = in.nextLine();
		in.close();
		
		strFind(userString,userWantedString);
	}
	public static void strFind(String userString, String userWantedString ){
		
		if(userWantedString==""){
			System.out.println("wynik 0");
		}
		else
		System.out.printf("wynik to %d",userString.indexOf(userWantedString));
	}
}
