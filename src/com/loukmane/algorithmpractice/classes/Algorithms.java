package com.loukmane.algorithmpractice.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {

	public static ArrayList<Integer> bubbleSort( ArrayList<Integer> listInt){
		Boolean flag = true;
		while(flag){
			flag = false;
			for(int i=0; i<listInt.size()-1; i++){
				if(listInt.get(i) < listInt.get(i+1)){
					flag = true;
					int tempInt = listInt.get(i);
					listInt.set(i, listInt.get(i+1));
					listInt.set(i+1,  tempInt);
				}
			}
		}
		return listInt;
	}
	
	
	public static int[] mergeSort(int[] arrayInt){
		
		if(arrayInt.length == 1)
			return arrayInt;
		
		double arrayLength = (double) arrayInt.length;	
		double t1 = (arrayLength - 1.0) / 2.0 ;
		int m = (int) Math.round(t1);
		
		int[] left = mergeSort(Arrays.copyOfRange(arrayInt, 0, m));
		int[] right = mergeSort(Arrays.copyOfRange(arrayInt, m, arrayInt.length - 1));
		
		double t3 = 1;
		double t2 = 2;
		
		double r = t3/t2;
		
		arrayInt = merge(left, right);

		return arrayInt;
	}
	
	public static int[] merge(int[] arrayInt1, int[] arrayInt2){
		
		int[] array = new int[arrayInt1.length + arrayInt2.length];	
		int i = 0;
		int j = 0;
		int count = 0;
		while(i<arrayInt1.length && j < arrayInt2.length){
			if(arrayInt1[i] < arrayInt2[j]){
				array[count] = arrayInt1[i];
				i++;
			}
			else{
				array[count] = arrayInt1[j];
				j++;
			}
			count++;
		}
		while(i < arrayInt1.length){
			array[count] = arrayInt1[i];
			i++;
			count++;
			
		}
		return array;
	}
}
