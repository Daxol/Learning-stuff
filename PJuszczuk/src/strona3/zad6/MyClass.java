package strona3.zad6;

public class MyClass {

	public static void main(String[] args){
		String[] myArray = {"Daniel","Weronika","Kacper","Bartek","Oliwia",};
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i].contains("B")){
				System.out.println(myArray[i]);
			}
			if(myArray[i].endsWith("a")){
				System.out.println(myArray[i]);
			}
		}
		
	}
}