package com.practice;

public class LargestSmalest {

	public static void main(String[] args) {
		
		int max = 0;
		int[] ar = new int[] { 88,0,88,88,88 };
		max = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < max) {
				max = ar[i];
			}
		}
		System.out.println("smallest number:" + max);

		
	}
}
