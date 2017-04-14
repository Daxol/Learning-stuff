package zad3;

public class MyClass {

	public static void main(String[] args) {
		System.out.println(encryptString("ala1", "Ala ma 2 koty"));
	}

	public static String encryptString(String keyCode, String userString) {

		int keyCounter = 0;

		String encryptedString = "";
		char tempChar;
		for (int i = 0; i < userString.length(); i++) {
			tempChar = userString.charAt(i);
			if ((tempChar >= 'a' && tempChar <= 'z') || (tempChar >= 'A' && tempChar <= 'Z')) {

				tempChar += keyCode.charAt(keyCounter) % 26;

				keyCounter = keyCounter >= (keyCode.length() - 1) ? 0 : keyCounter + 1;

				if (!((tempChar >= 'a' && tempChar <= 'z') || (tempChar >= 'A' && tempChar <= 'Z'))) {
					tempChar -= 26;
				}
			}
			encryptedString += tempChar;

		}
		return encryptedString;

	}

}
