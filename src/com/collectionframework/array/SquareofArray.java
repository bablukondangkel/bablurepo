package com.collectionframework.array;

public class SquareofArray {

	public static void main(String[] args) {
		int square=0;
		int [] ar=new int [] {12,13,14,15,16};
		for(int i=0; i<ar.length; i++) {
			square = ar[i]*ar[i];
			System.out.println(square);
		}
		
	}

}
