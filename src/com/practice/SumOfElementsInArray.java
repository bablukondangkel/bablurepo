package com.practice;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int[] ar = new int[] {1,2,3,4,4,5,6,7,8,9,8,7}; 
		int sum = 0;
		
		for(int i=0; i< ar.length; i++) {
			sum = sum + ar[i];
		}
		
		System.out.println("Sum is: "+sum);
		
	}

}
