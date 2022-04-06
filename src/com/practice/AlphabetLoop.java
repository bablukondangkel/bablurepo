package com.practice;

public class AlphabetLoop {

	public static void main(String[] args) {

		for(int i=10; i>=1; i--) {
			for(int x=10; x>=i; x--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=10; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" "+"");
			}
			for(int k=10; k>=i; k--) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}

}
