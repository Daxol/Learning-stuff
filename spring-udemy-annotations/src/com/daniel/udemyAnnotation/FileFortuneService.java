package com.daniel.udemyAnnotation;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Random;

public class FileFortuneService implements FortuneService {
	static String[] fortuneArray;

	public FileFortuneService() {

		try {
			LineNumberReader lineReader = new LineNumberReader(
					new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\difffile1.txt"));
			int index = 0;
			while (lineReader.readLine() != null) {

				index++;
			}
			lineReader.close();
			lineReader = new LineNumberReader(
					new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\difffile1.txt"));
			fortuneArray = new String[index];

			for (int i = 0; i < index; i++) {
				String a = "";
				a = lineReader.readLine();
				fortuneArray[i]=a;
			}
			lineReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Random rand = new Random();

	@Override
	public String getFortune() {
		try {
			return fortuneArray[rand.nextInt(fortuneArray.length)];
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

}
