package com.practice;

public class ArraySmallest {
	public static void main(String[] arg) {
		int[] ar=new int[] {2,3,6,7,56,3};
		int mim=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<mim) {
				ar[i]=mim;
			}
		}
		System.out.println("smallest number:"+mim);
	}

}
