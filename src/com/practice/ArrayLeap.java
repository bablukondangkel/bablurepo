package com.practice;

public class ArrayLeap {
	public static void main(String[] arg) {
		int[] ar=new int[] {2023};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%4==0 && ar[i]%100!=0){
				System.out.println("year is leap:"+ar[i]+" " );
			}else {
				System.out.println("Year is not leap:"+ar[i]);
			}
		}
	}

}
