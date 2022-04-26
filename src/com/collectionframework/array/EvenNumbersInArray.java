package com.collectionframework.array;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		
		int[] ar = new int[] {5, 8, 93, 68, 34, 57};
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.println(ar[i]);
			}
		}
		
	}

}
