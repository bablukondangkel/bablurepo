package com.practice;

public class OccranceArray {
	public static void main(String []arg) {
		int[] ar=new int[] {12,17,3,15,80};
		int count=0;
		int num=10;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==num) {
			count++;
		}
	}
		System.out.println("number is present ="+count);
		
	}
}
