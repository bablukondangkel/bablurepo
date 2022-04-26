package com.collectionframework.array;

public class DeleteNumberinArray {

	public static void main(String[] args) {
		int place = 5;
		int [] ar1 = new int [] {12,45,8,60,11,5,6};
		int [] ar2 = new int [ar1.length-1];
		
		
		for(int i=0 ; i<place-1; i++) {
			ar2[i] = ar1[i];	
		}
		for(int i = place ; i <ar1.length;i++) {
			ar2[i-1] = ar1[i];
			
		}
		for(int i=0 ; i<ar2.length ; i++) {
			System.out.print(ar2[i]+" ");
		}

}
   }