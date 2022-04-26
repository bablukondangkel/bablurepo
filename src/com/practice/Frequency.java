package com.practice;

public class Frequency {

	public static void main(String[] args) {
		int num=2;
		int count=0;
		int[] ar=new int[] {2,2,2,5,4,2,9,2,3,2};
		for(int i=0;i<ar.length;i++) {
			if(num==ar[i]) {
				count++;
			}
		}
		System.out.println("2 number is:"+count+":time");
	}

}
