package com.practice;

public class ArrayPrimeofLargest {
	public static void main(String[] arg) {
	int[] ar=new int[] {2,3,6,7,11,21};
	int max=0;
	int num=0;
	for(int i=0;i<ar.length;i++) {
		num=ar[i];
		int count=0;
	for(int j=1;j<=num;j++)	{
		
		if(num%j==0) {
			count++;
		}
		
	}
	if(count == 2) {
	if(ar[i]>max) {
		max=ar[i];
		
	}
	}
	}
	System.out.println("largest prime number:"+max);

}
}