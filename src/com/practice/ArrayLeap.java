package com.practice;

public class ArrayLeap {
	public static void main(String[] arg) {
		int[] ar=new int[] {2023,2024,2016,2002};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%4==0 && ar[i]%100!=0){
				System.out.println(ar[i]+"=is leap year");
			}else {
				System.out.println(ar[i]+"=is not leap year");
			}
		}
	}

}
