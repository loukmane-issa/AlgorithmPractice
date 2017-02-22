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
	
	public static int[] insertionSort(int[] nonSortedArray){
		int start = 0;
		int posExplored = 1;
		while(posExplored < nonSortedArray.length){
			for(int i = start; i>=0; i--)
			{
				if(nonSortedArray[posExplored] < nonSortedArray[i]){
					int temp = nonSortedArray[i];
					nonSortedArray[i] = nonSortedArray[posExplored];
					nonSortedArray[posExplored] = temp;
					posExplored = i; 
				}
				else
					break;
			}
			start++;
			posExplored=start+1;
		}
		return nonSortedArray;
	}
}
