package com.practice;

public class ArrayTest {
	public static void main(String[] arg) {
		int[] ar=new int[] {7,2,6,5,3,4};
		int num=10;
		int num1=15;
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.println("odd number"+ar[i]+num);
			}
			if(ar[i]%2==1) {
				count++;
				System.out.println("even num"+ar[i]+num1);
			}
		}
}
}