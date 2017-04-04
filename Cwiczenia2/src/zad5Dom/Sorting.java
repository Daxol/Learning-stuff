package zad5Dom;

public class Sorting {

	public static void main(String[] args) {
		String names = "daniel Paweł kamil Weronika Marcin";
		sortuj(names);
	}

	private static void sortuj(String str) {
		String[] strArray = str.split(" ");
		String temp;

		for (int i = 0; i < strArray.length; i++) {
			temp = strArray[i];
			for (int j = 0; j < strArray.length; j++) {

				int len = temp.toLowerCase().compareTo(strArray[j].toLowerCase());

				if (len < 0) {
					temp = strArray[j];
					strArray[j] = strArray[i];
					strArray[i] = temp;

				}
			}
		}
		for (String string : strArray) {
			System.out.println(string);
		}
	}
}
