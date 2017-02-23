package com.loukmane.algorithmpractice.linkedList;

import java.util.LinkedList;

public class LinkedListAlgos {
	
	public static LinkedListNode mathWithLinkedList(LinkedListNode listNode1, LinkedListNode listNode2){		

		int number1 = getNumberFromLinkedList(listNode1);
		int number2 = getNumberFromLinkedList(listNode2);
		
		return setNumberToLinkedList(number1 + number2);
		
	}
	
	public static LinkedListNode setNumberToLinkedList(int number){
		
		LinkedListNode head = null;
		while(number > 0){
			LinkedListNode node = new LinkedListNode(number % 10);
			if(head == null){
				head = node;
			}
			else
			{
				node.setNext(head);
				head = node;
			}
			number = number/10;
		}
		
		return head;
		
	}
	
	public static int getNumberFromLinkedList(LinkedListNode listNode1){
		
		//get length of listNode 1
		int lengthList1 = 0;
		LinkedListNode iterator = listNode1;
		while(iterator != null){
			lengthList1++;
			iterator = iterator.getNext();
		}
		
		//get number1
		iterator = listNode1;
		int numberListNode1 = 0;
		int powerLess = 0;
		while(iterator!=null){
			numberListNode1 = (int) (numberListNode1 + iterator.getValue() * Math.pow(10, lengthList1 - 1 - powerLess));
			powerLess = powerLess + 1;
			iterator = iterator.getNext();
		}
		return numberListNode1;
	}
	
}
