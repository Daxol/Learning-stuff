package zadanie6;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class HTMLfile {

	public static void main(String[] args)throws IOException{
		toHTML();
	}
	public static void toHTML() throws IOException{
		LineNumberReader bf = new LineNumberReader(new FileReader("C:\\Users\\Daniel\\Desktop\\diff\\file5.txt"));
		
		String[][] persons = new String[1][4];
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\html.html"));
		String temp;
		bw.write("<html><body><table>");
		while((temp=bf.readLine())!=null){
			bw.newLine();
			bw.write("<tr>");
			System.out.println(temp);
			persons[0] =  temp.split(" ");
			for (int j = 0; j < persons[0].length; j++) {
				bw.write("<td>"+persons[0][j]+"</td>");
			}
			bw.write("</tr>");
		}
		bw.write("</table></body></html>");
		bw.close();
		bf.close();
	}
}
