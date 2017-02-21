package com.loukmane.algorithmpractice.search;

public class SearchAlgos {

	public static int searchIntInOrderedArr(int start, int end, int value, int[] orderedArr){
		
		int middle = ((end - start)/2) + start;		
		
		if (orderedArr[middle] == value)
			return middle;
		else if(end-start == 0){
			return -1;
		}
		else if(orderedArr[middle] > value){
			System.out.println("iteration");
			return searchIntInOrderedArr(start, middle-1, value, orderedArr);
		}
		else{
			return searchIntInOrderedArr(middle+1, end, value, orderedArr);
		}
	}
}
