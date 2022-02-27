package com.practice;

public class RightAlphabatic {
public static void main(String[] arg) {
	char count='A';
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" "+count++);

		}
		System.out.println();
	}
}
}