package zadanie5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Emerytura {

	public static void main(String[] args) throws IOException {
		emerytura("C:\\Users\\Daniel\\Desktop\\diff\\file2.txt");
	}
	
	public static void emerytura(String fileName) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader(fileName));
		String tempLine;
		String[] person=new String[4];
		while((tempLine=bf.readLine())!=null){
			person = tempLine.split(" ");
			System.out.printf("%s %s %d\n",person[0],person[1],65-Integer.parseInt(person[3]));
		}
		bf.close();
	}
}
