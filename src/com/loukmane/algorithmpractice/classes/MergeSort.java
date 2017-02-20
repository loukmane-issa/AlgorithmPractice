package com.loukmane.algorithmpractice.classes;

public class MergeSort {
	private int[] array;
	private int[] tempMergArr;
	private int length;
	
	public void sort(int inputArr[]){
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length-1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex<higherIndex){
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle+1, higherIndex);
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex){
		
		for(int i = lowerIndex; i<=higherIndex; i++)
			tempMergArr[i] = array[i];
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j <= higherIndex){
			if(tempMergArr[i] <= tempMergArr[j])
				array[k++] = tempMergArr[i++];
			else
				array[k++] = tempMergArr[j++];
		}
		while(i<=middle){
			array[k++] = tempMergArr[i++];
		}
		 //printArray();
	}
	
	private void printArray(){
		System.out.print("{ ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+ " ");
		}
		System.out.println(" }");
	}
	
	
	
}
