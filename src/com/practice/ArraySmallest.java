package com.practice;

public class ArraySmallest {
	public static void main(String[] arg) {
		int[] ar=new int[] {1,2,3,6,7,56,3};
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				ar[i]=min;
			}
		}
		System.out.println("smallest number:"+min);
	}

}
