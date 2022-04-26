package com.collectionframework.array;

public class CopyevennuminArray {

	public static void main(String[] args) {
		int[] ar1 = new int[] { 12, 11, 3, 6, 7, 14, 16 };
		int[] ar2 = new int[ar1.length];
		int count = 0;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
					ar2[count] = ar1[i];
					count++;
			}

		}
		for(int i=0; i<ar2.length; i++) {
			System.out.println(ar2[i]);
		}
	}

}
