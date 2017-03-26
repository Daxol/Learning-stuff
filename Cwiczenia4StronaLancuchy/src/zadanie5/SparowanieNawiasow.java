package zadanie5;

import java.util.Scanner;

public class SparowanieNawiasow {

	public static void main(String[] args){
		int counter=0;
		System.out.println("podaj przyklad: ");
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		in.close();
		
		for (int i = 0; i < userInput.length(); i++) {
			if(userInput.charAt(i)=='('){
				counter++;
			}
			else if(userInput.charAt(i)==')'){
				counter--;
			}
		}
		if(counter!=0){
			System.out.println("błędne sparowanie nawiasów");
		}
		else{
			System.out.println("ok");
		}
	}
}
