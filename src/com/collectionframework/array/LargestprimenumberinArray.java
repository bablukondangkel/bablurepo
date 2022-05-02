package com.collectionframework.array;

public class LargestprimenumberinArray {

	public static void main(String[] args) {
		int [] ar = new int [] {2,12,3,45,7,11,2,41};
		int num=0;
		int max=0;
		for(int i=0 ; i < ar.length; i++) {
			num=ar[i];
			int count=0;
			for(int j=1; j<num; j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count<=2) {
				if(max>num) {
					System.out.print(" "+max);
					
				}
			}
		}
	}

}
