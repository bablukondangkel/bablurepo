package com.collectionframework.array;

public class EveninArray {

	public static void main(String[] args) {
		int sum=0;
		int [] ar=new int [] {12,45,78,34,22};
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
			sum=ar[i]+sum;
			}
}
		System.out.println(sum);
	}

}
