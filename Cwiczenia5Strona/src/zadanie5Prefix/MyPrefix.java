package zadanie5Prefix;

import java.util.Scanner;

public class MyPrefix {

	public static void main(String[] args){
		System.out.println("podaj tekst: ");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		System.out.println("podaj prefix: ");
		String userPrefix = in.nextLine();
		in.close();
		startsWith(userString, userPrefix);
	}
	
	public static void startsWith(String userString, String prefix){
		boolean isPrefix = true;
		for (int i = 0; i < prefix.length(); i++) {
			if(userString.charAt(i)!=prefix.charAt(i)){
				isPrefix=false;
			}
		}
		if(isPrefix &&(prefix.length()==userString.length())){
			System.out.println("wynik true, ponieważ wyraz jest zawsze swoim prefiksem.");
		}
		else if(isPrefix){
			System.out.printf("%s jest prefiksem %s ",prefix,userString);
		}
		else{
			System.out.printf("%s nie jest prefiksem %s ",prefix,userString);
		}
	}
}
