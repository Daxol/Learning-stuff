package zadanie2;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class FindAndWrite {

	public static void main(String[] args) throws IOException {
		szukaj("dom");
	}

	public static void szukaj(String slowo) throws IOException {

		LineNumberReader bf = new LineNumberReader(new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\file1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\file5.txt"));
		String currentLine;
		while ((currentLine = bf.readLine()) != null) {
			if (currentLine.contains(slowo)) {
				bw.write(bf.getLineNumber() + " " + currentLine);
				bw.newLine();

			}
		}
		try {
			bf.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
