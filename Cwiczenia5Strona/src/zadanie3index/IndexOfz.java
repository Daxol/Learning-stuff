package zadanie3index;

import java.util.Scanner;

public class IndexOfz {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("podaj tekst: ");
		String userString = in.nextLine();
		System.out.println("podaj znak: ");
		char ch = (char)in.next().charAt(0);
		in.close();
		System.out.println(strpos(userString,ch));
		
	}
	public static int strpos(String userString, char userChar){
		for (int i = 0; i < userString.length(); i++) {
			if(userString.charAt(i)==userChar){
				return i;
			}
		}
		return -1;
	}
}
