package com.practice;

public class Occurance {

	public static void main(String[] args) {
		int count =0;
		int num=10;
		int [] ar=new int[] {10,10,10,10,10,10,70,10};
		for (int i=0;i<ar.length;i++) {
			if(ar[i]==num) {
				count++;
			}
		}
		if(count<=num) {
			System.out.println("number is:"+count+" time");
		}
	}

}
