package przyklad1;


public class exercise1 {

		public static String[]split2(String string,char split_char1, char split_char2){
			int words_count=0;
			for (int i = 0; i < string.length(); i++) {
				if(string.charAt(i)==split_char1||string.charAt(i)==split_char2){
					words_count++;
				}
				
			}
		String[] return_string=new String[words_count+1];
		words_count=0;
			for (int j = 0; j < return_string.length; j++) {
				return_string[j]="";
			}
			
			for (int k = 0; k < string.length(); k++) {
				if(string.charAt(k)==split_char1||string.charAt(k)==split_char2){
					words_count++;
				}else{
					return_string[words_count]+=string.charAt(k);
				}
			}
			
			
			return return_string;
		}
	
	
	
		public static void main(String[] args){
//			ODCZYTYWANIE
//			Scanner in = new Scanner(System.in);
//			System.out.println("podaj liczb� ca�kowit�: ");
//			int a = in.nextInt();
//			System.out.println("podaj liczb� zmienno przecinkow� ");
//			double b = in.nextDouble();
//			System.out.format("podana liczba ca�kowita to %d natomiast zmienno przecinkowa to %.2f",a,b);
//			LOSOWANIE
//			Random r = new Random();
//			int random_a = r.nextInt(15)+1;
//			int random_b = r.nextInt(16)+15;
//			System.out.println("random_a "+ random_a + " random_b "+random_b );
//			int random_c = r.nextInt(21)-10;
//			System.out.println(random_c);
//			ZAOKRAGLANIE
//			double round_a = 1.124656;
//			round_a*= 1000;
//			round_a=Math.round(round_a);
//			round_a/=1000;
//			System.out.println(round_a);
//			int zaokragl = (int) Math.pow(10, 4);
//			double round_b = 1.555555;
//			round_b*=zaokragl;
//			round_b = Math.round(round_b);
//			round_b/=zaokragl;
//			System.out.println(round_b);
			
//			split2
			String doSplita = "Ala ma kota a_kot ma_Ale.";
	
			for (String string :split2(doSplita, ' ', '_') ) {
				System.out.println(string);
			}
		}
}
