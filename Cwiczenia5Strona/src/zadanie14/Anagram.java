package zadanie14;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args){
		
		System.out.println(isAnagram("kolej", "kole"));
		System.out.println(isAnagram("kolej", "k o l ej"));
		System.out.println(isAnagram("Gregory House", "Huge ego, sorry"));
	}
	public static boolean isAnagram(String firstWord, String secondWord) {
	    firstWord=firstWord.toLowerCase();
	    secondWord = secondWord.toLowerCase();
	    boolean anagram = true;
		char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     try{
	     int length =  word1.length>word2.length ? word2.length : word1.length;
	     System.err.println( firstWord + " "+ secondWord+ " ");
	     
	    	 for (int i = 0; i < length; i++) {
	    		 System.err.println("word1: "+word1[i]+" word2: "+word2[i]);
				if(word1[i] != word2[i]){
					anagram=false;
				}
			}
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }
	     return anagram;
	}
}
