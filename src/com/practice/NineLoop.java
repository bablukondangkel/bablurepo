package com.practice;

public class NineLoop {
	public static void main(String[] arg) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(9);
			}
			System.out.println();
		}
	}
}
