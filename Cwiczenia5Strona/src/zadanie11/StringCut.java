package zadanie11;

import java.util.Scanner;

public class StringCut {

	public static void main(String[] args){
		System.out.println("podaj zdanie: ");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		System.out.println("gdzie zacząć ciąć?: ");
		int whereStart = in.nextInt();
		System.out.println("ile wyciąć? ");
		int howManyCut = in.nextInt();
		in.close();
		System.out.println("wynik to: "+strCut(userString, whereStart, howManyCut));
	}
	public static String strCut(String userString, int whereStart, int howManyCut){
		String finishString ="";
		finishString +=userString.substring(0,whereStart);
		finishString+=userString.substring(whereStart+howManyCut);
		return finishString;
	}
}
