package com.collectionframework.array;

public class DeletionFromArray {

	public static void main(String[] args) {
		int x=5;
		int place = 4;
		int[] ar1 = new int[] {2,3,4,6,7};
		int[] ar2 = new int[ar1.length + 1];
		
		for(int i = 0; i<place-1; i++) {
			ar2[i] = ar1[i];
		}
		
		for(int j = place; j<ar1.length;j++) {
			ar2[place-1] = x; 
			System.out.println(ar2[j]);
		}

		//for(int i = 0; i<ar2.length; i++) {
			//System.out.print(ar2[i] + " ");
		}
		
	}

//}
