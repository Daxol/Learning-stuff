package zadanie8;

import java.util.Scanner;

public class WordCountTask {

	public static void main(String[] args){
		System.out.println("podaj ciąg znaków: ");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		in.close();
		System.out.println(wordCount(userString));
	}
	public static int wordCount(String userString){
		String trim = userString.trim();
		if(trim.isEmpty())
			return 0;
		return trim.split("\\s+").length;
	}
}
