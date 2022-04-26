package com.collectionframework.array;

public class PrimenumbersuminArray {

	public static void main(String[] args) {
		int sum=0;
		int[] ar=new int[] {12,13,19,11};
		for(int i=0 ; i<ar.length ; i++) {
		int count=0;
			for(int j=1;j<=ar.length;j++) {
			if(ar[i]%j==0) {
				count++;
	}
		}
		
		if(count<=2) {
			sum=ar[i]+sum;
	}		
		}
		System.out.println(sum);
	}

}
