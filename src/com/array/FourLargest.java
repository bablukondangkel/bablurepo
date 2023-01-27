package com.array;

import java.util.Arrays;

public class FourLargest {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 1, 1, -5};
		
	}
	
	public static int ArrayChallenge(int[] arr) {
		int sum = 0;
		Arrays.sort(arr);
		if(arr.length<=4) {
			for(int i=0; i<arr.length; i++) {
				sum = sum + arr[i];
			}
		}else {
			for(int i = 0; i<4; i++) {
				sum = sum + arr[i];
			}
		}
		
		String val = String.valueOf(sum);
		char[] ch = val.toCharArray();
		
		
		
		return sum;
		
	}
	
	

}
