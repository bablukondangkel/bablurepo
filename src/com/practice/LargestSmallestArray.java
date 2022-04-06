package com.practice;

public class LargestSmallestArray {
	public static void main(String arg[]) {
		int[] ar=new int[] {200,2,5,100,1};
		int sm=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<sm) {
				sm = ar[i];
			}
			}
		System.out.println(sm+" is smallest number");
		}
}
	
	