package strona3.zad9;

import java.util.Random;

public class MyClass {

	public static void main(String[] args){
		Random rand = new Random();
		float[] myArray = new float[10];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (float) (rand.nextFloat()  -0.5);
		}
		for (float f : myArray) {
			System.out.printf("%.2f  ",f);
		}
	}
}
