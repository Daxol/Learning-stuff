package strona3.zad4;

import java.util.Random;

public class RandomValue {

	public static void main(String[] args){
		int counter=0;
		
		Random rand= new Random();
		int[][] myArray = new int[10][10];
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				myArray[i][j]=rand.nextInt(30-15+1)+15;
				System.out.printf("%3d ",myArray[i][j]);
				if(myArray[i][j]==20) counter++;
			}
			System.out.println();
		}
		System.out.printf("numer 20 pojawil się %d razy",counter);
	}
}
