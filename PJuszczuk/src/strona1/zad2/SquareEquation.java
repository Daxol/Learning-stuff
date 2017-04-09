package strona1.zad2;

public class SquareEquation {

	public static void main(String[] args){
		int a = 1;
		int b = 4;
		int c = 2;
		
		float delta;
		
		delta = (float) Math.pow(b, 2) - 4*a*c;
		if(delta>0){
			float x1 = (float) (((-b) + Math.sqrt(delta)))/2*a;
			float x2 = (float) (((-b) - Math.sqrt(delta)))/2*a;
		System.out.printf("pierwszy pierwiastek %.2f, drugi %.2f",x1,x2);
		}
		else if(delta == 0){
			float x = (float) -b/2*a;
			System.out.println("pierwiastek tego równania jest "+x);
		}
		else{
			System.out.println("nie ma rozwiązań");
		}
	}
}
