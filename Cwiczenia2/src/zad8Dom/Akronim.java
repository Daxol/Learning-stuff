package zad8Dom;

public class Akronim {

	public static void main(String[] args) {
		getAkronim("Rzeczpospolita Polska");
		getAkronim("Wydział Informatyki i Nauki o Materiałach");
	}

	private static void getAkronim(String str) {
		String firstLetters = "";
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			firstLetters += strArray[i].charAt(0);
		}
		System.out.println(firstLetters.toUpperCase());
	}
}
