package com.practice;

public class Operator {
public static void main(String [] arg ) {
	int a=5000;
	int b=30000;
	int c=1000000;
	if (a>= b && a>c ) {
		System.out.println("The greatest no. is" + a);
	} else if (b > c) {
		System.out.println("The greatest no. is" + b);
	} else {
		System.out.println("The greatest no. is" + c);
	}
	}
}
