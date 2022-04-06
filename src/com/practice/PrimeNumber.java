package com.practice;

public class PrimeNumber {
	public static void main(String[] arg) {
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count<=2) {
			System.out.println("number is prime");
			
		}else{
			System.out.println("number is not prime");
		}
	} 
	}
	



