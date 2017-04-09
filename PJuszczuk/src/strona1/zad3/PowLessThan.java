package strona1.zad3;
import java.util.Scanner;
public class PowLessThan {

	public static void main(String[] args){
		
		System.out.println("podaj n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int a=2;
		while(a<n){
			System.out.println(a);
			a*=2;
		}
		a=3;
		while(a<n){
			System.out.println(a);
			a*=3;
		}
	}
}
