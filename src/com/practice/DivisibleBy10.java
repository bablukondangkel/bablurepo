package com.practice;

public class DivisibleBy10 {
	public static void main(String arg[]) {
		int[] ar=new int[] {2,3,4,5,10,20,30,50};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%10==0) {
				System.out.println("this number is divisible by 10="+ar[i]);	
			}	
	}
}
}