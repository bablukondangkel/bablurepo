package com.practice;

public class ArrayEven {
public static void main(String[] arg) {
	int[] ar= new int[] {2,9,11,13,61,62,88,46};
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==0) {
			System.out.print(i+ " ");
		}
	
	}
	
}
}