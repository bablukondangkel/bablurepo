package com.practice;

public class PrimeNumber {
	public static void main(String[] arg) {
		int num=4;
		int count=0;
		for(int i=2;i<=num%2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("number is not prime");
			
		}else{
			System.out.println("number is prime");
		}
	} 
	}
	



