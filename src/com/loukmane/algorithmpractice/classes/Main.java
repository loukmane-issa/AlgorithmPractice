package com.loukmane.algorithmpractice.classes;

import java.util.ArrayList;

import com.loukmane.algorithmpractice.linkedList.LinkedListAlgos;
import com.loukmane.algorithmpractice.linkedList.LinkedListNode;
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
		testLinkedListAlgos();
	}
	
	public static void testLinkedListAlgos(){
		
		
		LinkedListNode linkedList11 = new LinkedListNode(3);
		LinkedListNode linkedList12 = new LinkedListNode(1);
		LinkedListNode linkedList13 = new LinkedListNode(5);
		
		linkedList11.setNext(linkedList12);
		linkedList12.setNext(linkedList13);
		
		LinkedListNode linkedList21 = new LinkedListNode(5);
		LinkedListNode linkedList22 = new LinkedListNode(9);
		LinkedListNode linkedList23 = new LinkedListNode(2);
		linkedList21.setNext(linkedList22);
		linkedList22.setNext(linkedList23);
		
		LinkedListAlgos.mathWithLinkedList(linkedList11, linkedList21).printIt();
	}

	public static void testStringAlgos(){
		System.out.println(StringAlgos.spacetoPercentTwenty("a 2 3 "));
	}
}
