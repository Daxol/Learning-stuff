package zad4Dom;

public class DistanceLetters {

	public static void main(String[] args) {

		firstLast("cccvvccc", 'v');

	}

	private static void firstLast(String str, char c) {

		String temp;
		int pos1 = -1;
		int pos2 = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				if (pos1 == -1) {
					pos1 = i;
					pos2 = i;
				} else {
					pos2 = i;
				}
			}
		}
		try {
			temp = str.substring(pos1 + 1, pos2);
			System.out.println(temp + " odleglosc " + (pos2 - (pos1 + 1)));
		} catch (Exception e) {
			System.out.println(-1);
		}
	}
}
