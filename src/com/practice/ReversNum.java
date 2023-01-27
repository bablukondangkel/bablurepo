package com.practice;

public class ReversNum {

	public static void main(String[] args) {
		int num=1234,reverse=0;
		while(num!=0) {
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
			
		}
		System.out.println("reverse num="+reverse);
	}

}
