package strona1.zad4;

import java.util.Scanner;

public class LoadUntilZero {

	public static void main(String[] args) {

		int sum = 0;
		int counter = 1;
		int min;
		int max;

		Scanner in = new Scanner(System.in);
		int temp = in.nextInt();
		max = min = temp;
		sum += temp;
		while (temp != 0) {
			temp = in.nextInt();
			counter++;
			sum += temp;
			if (temp > max)
				max = temp;
			if (temp < min)
				min = temp;
		}
		in.close();
		System.out.printf("Suma to %d, średnia to %.2f min to %d a max to %d",sum,(float)sum/counter,min,max);
	}
}
