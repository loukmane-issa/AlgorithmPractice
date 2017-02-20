package com.loukmane.algorithmpractice.numeric;

import java.util.ArrayList;

public class NumericAlgos {

	public static Boolean prime(int number) {
		
		for(int i = 2; i < number; i++){
			for(int j = 1; j < Math.sqrt(number); j++){
				if( i * j == number)
					return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> decToBin(int value){
		ArrayList<Integer> binary = new ArrayList<>();
		while(value > 0){
			binary.add(value % 2);
			value = value/2;
		}
		return binary;
	}
	
	public static int greatestDenominator(int m, int n){
		if(n == 0){
			return m;
		}
		return greatestDenominator(n, m % n);
	}
	
	public static int factorial(int i){
		if(i==1)
			return 1;
		else
			return i * factorial(i-1);
	}
	
}
