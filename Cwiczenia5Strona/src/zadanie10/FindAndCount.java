package zadanie10;

import java.util.Scanner;

public class FindAndCount {

	public static void main(String[] args) {
		System.out.println("podaj zdanie: ");
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
		System.out.println("co szukać?");
		String whatFind = in.nextLine();
		in.close();
		System.out.println("wynik to "+strFindAndCount(userString, whatFind));

	}

	public static int strFindAndCount(String where, String whatFind) {
		where = where.trim();
		return where.split(whatFind, -1).length-1;
		

	}
}
