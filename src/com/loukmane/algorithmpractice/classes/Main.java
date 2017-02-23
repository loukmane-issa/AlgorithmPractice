package com.loukmane.algorithmpractice.classes;

import java.util.ArrayList;

import com.loukmane.algorithmpractice.numeric.NumericAlgos;
import com.loukmane.algorithmpractice.search.SearchAlgos;
import com.loukmane.algorithmpractice.sort.SortAlgos;
import com.loukmane.strings.StringAlgos;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(3);
		myList.add(5);
		myList.add(1);
		myList.add(2);
		myList.add(10);
		myList.add(50);
		myList.add(2);
		
        MergeSort mms = new MergeSort();
        mms.sort(test);
        for(int i : test){
            System.out.print(i);
            System.out.print(" ");*/	
//        }

/*		int[] test = {3, 2, 1, 23, 5, 16, 7, 1, 2056, 56, 87, 10, 55, 2056};
		
		int [] testSorted = SortAlgos.insertionSort(test);
		
		for(int i = 0; i<testSorted.length; i++){
			System.out.print(testSorted[i] + ", ");
		}*/
		testStringAlgos();
	}
	

	public static void testStringAlgos(){
		System.out.println(StringAlgos.detectPalindrome("Was it Eliot's toilet I saw?"));
	}
}
