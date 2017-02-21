package com.loukmane.algorithmpractice.sort;

public class SortAlgos {

	public static int[] selectionSort(int [] nonSortedArray){
		
		int start = 0;
		while(start < nonSortedArray.length){
			for(int i = start; i<nonSortedArray.length; i++){
				if(nonSortedArray[start] > nonSortedArray[i]){
					int temp = nonSortedArray[start];
					nonSortedArray[start] = nonSortedArray[i];
					nonSortedArray[i] = temp;
				}
			}
			start++;
		}
	
		return nonSortedArray;
	}
	
}
