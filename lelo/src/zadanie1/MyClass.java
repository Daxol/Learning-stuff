package zadanie1;

import java.util.Random;

public class MyClass {

	public static void main(String[] args) {

		float min =0;
		float[][] myArray = new float[25][25];
		Random random = new Random();
		for (int i = 0; i < myArray.length; i++) {
			for (int j = myArray[i].length-1; j >=0; j--) {
				if(myArray.length-j<=i){
					myArray[i][j]=0;
					System.out.printf("%3d",0);
					
				}
				else{
					myArray[i][j]=(float) (random.nextFloat()*(2.4+0.99)-0.99);
					System.out.printf(" %3.3f ",myArray[i][j]);
					
				}
			}
			System.out.println();
		}
		System.out.printf("\n \n \n %.2f",min);
	}

}
