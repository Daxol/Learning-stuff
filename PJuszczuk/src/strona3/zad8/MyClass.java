package strona3.zad8;

import java.util.Random;

public class MyClass {

	public static void main(String[] args){
		int numberOfRow=-1;
		Random rand = new Random();
		int sum=0;
		int sum2=0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				sum2+=rand.nextInt(21);
				
				
			}
			System.out.printf("%d suma: %d \n",i,sum2);
			if(sum2>sum){
				sum=sum2;
				sum2=0;
				numberOfRow=i;
			}
			
		}
		System.out.println(sum + "    "+numberOfRow);
	}
}
