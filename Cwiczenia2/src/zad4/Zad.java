package zad4;

public class Zad {

	public static void main(String[] args) {
		firstlast("dAaddddad", 'a');
	}

	public static void firstlast(String s, char c) {
		int countChar = 0;
		String temp = "";
		boolean isC = false;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == c) {
				if (isC == false) {
					isC = true;
				} else {
					isC = false;
					System.out.println("ilosc znakow: " + countChar + "tekst: " + temp);
					temp = "";
					countChar = 0;
				}
			}
			else if (isC) {
				temp += s.charAt(i);
				countChar++;
			}
			else if(i==s.length()-1){
				System.out.println("ilosc znakow: " + -1 + "tekst: " + temp);

			}
		}
	}
}