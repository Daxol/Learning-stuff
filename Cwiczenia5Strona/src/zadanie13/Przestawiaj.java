package zadanie13;



public class Przestawiaj {

	public static void main(String[] args) {
		String word = "Egzamin";
		int[] kol = { 0, 1, 4, 3, 2, 6, 5 };
		System.out.println(poprzestawiaj(word, kol));
	}

	public static String poprzestawiaj(String word, int[] kolejnosc) {
		String[] returnString = new String[kolejnosc.length];
		String temp = "";
		for (int i = 0; i < kolejnosc.length; i++) {

			temp += word.charAt(kolejnosc[i]);
			returnString[i] = temp;
			temp = "";
		}
		StringBuilder buider = new StringBuilder();
		for (String string : returnString) {
			buider.append(string);
		}
		return buider.toString();
	}
}
