package com.practice;

public class FiveLoop {
	public static void main(String[] arg) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(j);
			}
			System.out.println();
		}
	}

}
