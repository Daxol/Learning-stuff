package zadanie2;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println("podaj ciąg znaków: ");
		Scanner in = new Scanner(System.in);
		String words = in.nextLine();
		in.close();
		
		String reverse ="" ;
		try{
		for (int i = words.length()-1; 0<=i; i--) {
			reverse+=words.charAt(i);
		}}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(reverse);
	}
}