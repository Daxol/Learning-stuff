package zad2Dom;

public class FindAndCount {

	public static void main(String[] args) {
		String[][] tab = { { "dom", "a", "c" }, { "domdom", "do dom", "af" }, { "domdom", "do dom", "af" } };
		System.out.println(findWord(tab, "dom"));
	}

	private static int findWord(String[][] tab, String word) {
		int counter = 0;
		int longOfWords = 0;
		String conca = "";
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {

				longOfWords += tab[i][j].length();
				counter += tab[i][j].split(word, -1).length - 1;
				if ((j % 5 == 0) && (i % 5 == 0)) {
					if (tab[i][j].length() < 3) {
						conca += tab[i][j];
					} else
						conca += tab[i][j].substring(0, 2);
				}
			}
		}
		System.out.println("srednia dlugosc" + longOfWords / (tab.length * tab[0].length));
		System.out.println(conca);

		return counter;
	}
}
