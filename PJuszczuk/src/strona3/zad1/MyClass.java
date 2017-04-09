package strona3.zad1;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args){
		System.out.println("podaj litere do zamiany: ");
		Scanner in = new Scanner(System.in);
		char firstLet = (char) in.next().charAt(0);
		System.out.println("zamien na ");
		char secondLet = (char) in.next().charAt(0);
		in.close();
		
		String zdanie = new String("Ala ma kota");
		zdanie = zdanie.replace(firstLet, secondLet);
		System.out.println(zdanie);
	}
}
