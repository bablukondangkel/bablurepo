package com.oops;

public class ReversewithswipeinArray {

	public static void main(String[] args) {
		int[] ar=new int[] {12,45,23,56,78};
		System.out.println("original array");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("reverse array");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
	}

}
