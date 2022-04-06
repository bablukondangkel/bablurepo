package com.practice;

public class AarryPrime {
	
	public static void main(String[] arg) {
		int sum=0;
		int[]ar=new int[] {23,7,5,41,90,87,34};
		for(int i=0;i<ar.length;i++) {
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
		System.out.println("prime of sum num ="+sum);
	}
}

