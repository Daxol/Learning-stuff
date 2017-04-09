package strona3.zad5;

public class Fibon {

	public static void main(String[] args){
		int[] myArray = new int[20];
		
		myArray[0]=myArray[1]=1;
		for (int i = 2; i < myArray.length; i++) {
			myArray[i]= myArray[i-1]+myArray[i-2];
		System.out.printf("%4d ",myArray[i]);
		}
		
	}
}
