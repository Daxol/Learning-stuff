package zad6Dom;

public class ReverseNumbers {

	public static void main(String[] args) {
		reverseValue(12345);
	}

	private static void reverseValue(int val) {
		int temp = 0;
		int input = val;
		while (input % 10 != 0) {
			temp = (temp * 10) + input % 10;

			input = (input / 10);

		}
		System.out.println(temp);
	}
}
