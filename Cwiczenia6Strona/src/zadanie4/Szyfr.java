package zadanie4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Szyfr {

	public static void main(String[] args) throws IOException {
		szyfruj("file1.txt", -2);
	}

	public static void szyfruj(String fileName, int moveNumber) throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\" + fileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\_" + fileName));
		String tempLineToSave = "";
		String tempLine;
		char tempChar;
		while ((tempLine = bf.readLine()) != null) {
			for (int i = 0; i < tempLine.length(); i++) {
				tempChar = tempLine.charAt(i);
				if (tempChar >= 'a' && tempChar <= 'z') {
					tempChar = (char) (tempChar + moveNumber);
					if (tempChar < 'a') {
						tempChar += 26;
					} else if (tempChar > 'z') {
						tempChar -= 26;
					}
				} else if (tempChar >= 'A' && tempChar <= 'Z') {
					tempChar = (char) (tempChar + moveNumber);
					if (tempChar < 'A') {
						tempChar += 26;
					} else if (tempChar > 'Z') {
						tempChar -= 26;
					}
				}
				tempLineToSave += tempChar;
			}
			bw.write(tempLineToSave);
			bw.newLine();
			tempLineToSave = "";
		}
		bf.close();
		bw.close();

	}
}
