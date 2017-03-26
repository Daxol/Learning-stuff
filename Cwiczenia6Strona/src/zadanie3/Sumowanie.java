package zadanie3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sumowanie {

	public static void main(String[] args) throws IOException {
		sumuj();
	}

	public static void sumuj() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\liczby.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\liczby.txt",true));
		int sum=1;
		String temp;
		while((temp = bf.readLine())!=null){
			sum+= Integer.parseInt(temp);
			System.out.println(sum);
		}
		bw.newLine();
		bw.write(Integer.toString(sum));
		bw.close();
		bf.close();
	}
}
