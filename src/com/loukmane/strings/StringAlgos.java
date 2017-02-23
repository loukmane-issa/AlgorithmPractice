package com.loukmane.strings;

import java.util.HashMap;

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
	
	
	public static Boolean uniqueChar(String str_s){
		str_s = str_s.replaceAll("[^a-zA-Z]", "");
		str_s = str_s.replaceAll("\\s+", "");
		str_s = str_s.toUpperCase();
		char[] str = str_s.toCharArray();
		HashMap<Character, Integer> charNbIter = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length; i++){
			if(charNbIter.containsKey(str[i]))
				return false;
			else
				charNbIter.put(str[i], 1);
		}
		
		return true;
	}
	
	public static char[] spacetoPercentTwenty(String str_st){
		char[] str_s = str_st.toCharArray();
		int length = str_s.length;
		int spaceCount = 0;
		
		for(int i = 0; i<str_s.length; i++){
			if(str_s[i] == ' ')
				spaceCount++;
		}
		
		int newLength = (spaceCount * 2) + str_s.length;
		
		char[] str = new char[newLength];
		int writerPos = 0;
		
		for(int i = 0; i<str_s.length; i++){
			if(str_s[i] == ' '){
				str[writerPos++] = '%';
				str[writerPos++] = '2';
				str[writerPos++] = '0';
			}
			else
				str[writerPos++] = str_s[i];
		}		
		return str;
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
