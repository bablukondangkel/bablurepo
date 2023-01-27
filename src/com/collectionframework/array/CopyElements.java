package com.collectionframework.array;

public class CopyElements {

	public static void main(String[] args) {
		int [] ar=new int [] {12,45,13,15};
		int [] ar1=new int [ar.length];
		for(int i=0;i<ar.length;i++) {
			ar1[i]=ar[i];
	}
		for(int j=0;j<ar1.length;j++) {
			System.out.print(ar1[j]+" ");
		}
		
	}

}
