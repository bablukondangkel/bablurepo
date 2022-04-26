package com.collectionframework.array;

public class CopyArray {

	public static void main(String[] args) {

		int[] ar1 = new int[] {10,20,30,40,50};
		int[] ar2 = new int[ar1.length];
		for(int i=0;i<ar1.length;i++) {
			ar2[i] = ar1[i];
		}
		
		for(int i=0; i<ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}

}
}