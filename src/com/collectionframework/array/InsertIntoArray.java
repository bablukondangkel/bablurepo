package com.collectionframework.array;

public class InsertIntoArray {

	public static void main(String[] args) {
		int x=40;
		int place=4;
		int[] ar1=new int[] {10,20,30,50,60};
		int[] ar2=new int[ar1.length+1];
		
		ar2[place-1] = x;
		
		for(int i = 0; i<place-1; i++) {
			ar2[i] = ar1[i];
			//System.out.print(ar2[i] + " ");
		}
		
		for(int j = place-1; j<ar1.length; j++) {
			ar2[j+1] = ar1[j];
			//System.out.print(ar2[j] + " ");
		}
		
		for(int v = 0; v<ar2.length; v++) {
			System.out.print(ar2[v] + " ");
		}
		
	}

}
