package com.practice;

public class AarryPrime {
	public static void main(String[] arg) {
		int[]ar=new int[] {23,7,5,41,90,87,34};
		int sum=0;
		for(int i=0;i<=ar.length-1;i++) {
			int count=0;
		for(int j=1;j<=ar[i];j++) {
			if(ar[i]%j==0) {
				count++;
			}
		}
		if(count==2) {
			sum=sum+ar[i];
		}
		}
		System.out.println("sum is:"+sum);
		
				
		}
	}

