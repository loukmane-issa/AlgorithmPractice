package com.loukmane.strings;

public class StringAlgos {

	
	public static Boolean detectPalindrome(String str_s){
		str_s = str_s.replaceAll("[^a-zA-Z]", "");
		str_s = str_s.replaceAll("\\s+", "");
		str_s = str_s.toUpperCase();
		char[] str = str_s.toCharArray();
		
		for(int i = 0, j = str.length-1; i<=j ; i++, j--){
			if(str[i] != str[j])
				return false;
		}
		return true;
	}
	
	
	

	
	//This function reverseString and also remove unused whitespace :)
	public static String reverseString(String str_s){
		char[] reversedString = new char[str_s.length()];
		char[] str = str_s.toCharArray();
		int posRev = 0;
		
		int last = str.length - 1;
		int start = last;
		
		while(last >= 0){
			if(str[start] != ' '){
				while(start >= 0 && str[start] != ' '){
					start--;
				}
				for(int i = start+1; i<= last; i++){
					reversedString[posRev++] = str[i];
				}
				if(posRev < str.length - 1)
					reversedString[posRev++] = ' ';
			}
			start = start - 1;
			last = start;
		}
		
		return new String(reversedString);
	}
	
}
