package com.loukmane.algorithmpractice.linkedList;

public class LinkedListNode {

	private int value;
	private LinkedListNode next;
	
	public LinkedListNode(int value) {
		this.value = value;
	}
	
	

	public int getValue() {
		return value;
	}



	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
	public void printIt(){
		LinkedListNode myNode = this;
		while(myNode != null){
			System.out.println(myNode.value + " -> ");
			myNode = myNode.getNext();
		}
	}
	
}
