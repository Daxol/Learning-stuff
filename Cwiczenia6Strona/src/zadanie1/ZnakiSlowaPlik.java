package zadanie1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZnakiSlowaPlik {

	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\Daniel\\Desktop\\diff\\file1.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String currentLine;
		String wholeText = "";
		while ((currentLine = reader.readLine()) != null) {
			wholeText += "\n" + currentLine;
		}
		try {
			if (reader != null) {
				reader.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int number :  liczZnaki(wholeText)) {
			System.out.println(number);
		}
	}

	public static int[] liczZnaki(String fileString) {
		String temp = fileString;
		String trim = fileString.trim();
		int[] returnArray = new int[3];
		returnArray[0]= temp.length();
		returnArray[1]= (temp.length() - temp.replaceAll(" ","").length());
		if (!trim.isEmpty()) {
			returnArray[2] = trim.split("\\s+").length;
		}
		return returnArray;
	}
}
