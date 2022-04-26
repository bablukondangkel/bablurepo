package com.collectionframework.array;

public class SuminArray {

	public static void main(String[] args) {
		int sum=0;
		int [] ar=new int [] {12,4,23,8,14};
		for(int i=0; i<ar.length; i++) {
			sum=sum+ar[i];
		}
		System.out.println(sum);
	}

}
