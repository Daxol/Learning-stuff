package patryk;

public class StringSecondToUpper {

	public static void main(String[] args) {
		System.out.println(toUpperSecond("zdanie"));

	}
	
	private static String toUpperSecond(String str){
		
		String returnStr="";
		String temp="";
		for (int i = 1; i < str.length(); i+=2) {
		try{	returnStr+=str.charAt(i-1);
			temp+=str.charAt(i);
			returnStr+=temp.toUpperCase();
			temp="";
		}catch(Exception e){
			return returnStr;}
		}
		return returnStr;
		
	}

}
