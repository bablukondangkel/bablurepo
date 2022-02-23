package com.practice;

public class PrimeNumber2 {
	public static void main(String[] arg) {
	
		for(int a=1;a<=100;a++) {
			int c=0;
			for(int b=1;b<=a;b++) {
				if(a%b==0) {
					c++;
				}
			}
					if(c==2) {
						System.out.println(a+" is prime");
						
					}else
					System.out.println(a+ " is Not prime");
					
					
				
			}
	
		}
	}

