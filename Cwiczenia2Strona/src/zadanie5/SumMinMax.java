package zadanie5;
import java.util.Scanner;

public class SumMinMax {

	public static void main(String[] args){
		
		int valueMax;
		int valueMin;
		int tempValue;
		Scanner in = new Scanner(System.in);
		System.out.print("podaj liczbę: ");
		valueMax = valueMin = tempValue =in.nextInt();
		while(tempValue!=0){
			System.out.print("podaj liczbę: ");
			if(tempValue>valueMax){
				valueMax = tempValue;
			}
			else if(tempValue<valueMin){
				valueMin = tempValue;
			}
			tempValue = in.nextInt();
		}
		in.close();
		System.out.println(valueMin);
		System.out.printf("suma liczby największej i najmniejszej to %d a ich średnia to %.2f",valueMax + valueMin, ((float)valueMax + valueMin)/2);
	}
}
