package zad2;

public class Zad2 {

	public static void main(String[] args){
		
		String[][] myArray= {{"cos","co","dom"},{"co","a","b"}};
		System.out.println(countWord(myArray,"co" ));
	}
	public static int countWord(String[][] myArray,String find){
		int counter=0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				counter += myArray[i][j].split(find,-1).length-1;
			}
		}
		return counter;
		
	}
}
