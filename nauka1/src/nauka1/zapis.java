package nauka1;

import java.util.Random;
import java.util.Scanner;

public class zapis {

	public static void main(String[] args){
		Random r = new Random();
//		Scanner scan = new Scanner(System.in);
//		int userInPut = scan.nextInt();
//		System.out.println(userInPut);
		float c = r.nextFloat()*10;
		double pi = Math.PI;
		System.out.println(pi*100+" "+ Math.round(pi*100)+" "+pi);
		System.out.format("\n liczba: %.2f, %.1f",c,c);
	}
}
