package com.collectionframework.array;

public class AllprimeNumInArray {

	public static void main(String[] args) {

		int[] ar1 = new int[] { 14,13,2,3, 6, 4, 7, 5 ,11};
		for (int i = 0; i < ar1.length; i++) {
			int count = 0;
			for (int j = 1; j <= ar1[i]; j++) {
				if (ar1[i] % j == 0) {
					count++;
				}
			}
			if(count<=2) {
				System.out.print(ar1[i]+" ");
			}
		}

	}

}
