import java.io.LineNumberReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class diff {
	public static void main(String[] args) throws IOException {
		
		difff("file1.txt", "file2.txt");

	}

	public static void difff(String file1, String file2) {
		String wynik = "";
		LineNumberReader reader_file1;
		try {
			reader_file1 = new LineNumberReader(new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\" + file1));
			LineNumberReader reader_file2 = new LineNumberReader(
					new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\" + file2));
			String line_file1 = reader_file1.readLine();
			String line_file2 = reader_file2.readLine();
			while (line_file1 != null && line_file2 != null) {
				if (!line_file1.equals(line_file2)) {
					wynik += String.format("\nlinie nr %d nie s¹ sobie równe ", reader_file1.getLineNumber());

					String[] linia_array1 = line_file1.split(" ");
					String[] linia_array2 = line_file2.split(" ");
					wynik += String.format("\n ró¿nice w lini nr %d: ", reader_file1.getLineNumber());
					for (int i = 0; i < linia_array1.length; i++) {
						if (linia_array1[i] != linia_array2[i]) {
							wynik += String.format("\n	p1: %s p2: %s", linia_array1[i], linia_array2[i]);

						}
					}

				} else {
					wynik += String.format("\nlinie nr %d s¹ równe", reader_file1.getLineNumber());
				}
				line_file1 = reader_file1.readLine();
				line_file2 = reader_file2.readLine();
			}
			if (line_file1 != null && line_file2 == null) {
				wynik += String.format("\n dodatkowe linie w pliku 1: ");
			}

			while (line_file1 != null && line_file2 == null) {
				wynik += String.format("\n	linia nr %d : %s", reader_file1.getLineNumber(), line_file1);
				line_file1 = reader_file1.readLine();

			}
			if (line_file2 != null && line_file1 == null) {
				wynik += String.format("\n  dodatkowe linie w pliku 2: ");
			}

			while (line_file2 != null && line_file1 == null) {
				wynik += String.format("\n	linia nr %d : %s", reader_file2.getLineNumber(), line_file2);
				line_file2 = reader_file2.readLine();

			}
			reader_file1.close();
			reader_file2.close();
			System.out.println(wynik);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error");
		}
		String[] array_wynik = wynik.split("\\n");
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\diff" + file1));
			for (String string : array_wynik) {
				writer.write(string);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
