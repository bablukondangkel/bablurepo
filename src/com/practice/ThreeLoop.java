package com.practice;

public class ThreeLoop {
	public static void main(String[] arg) {
		for (int i = 4; i >= 1; i--) {
			for (int x = 1; x <= 4 - i; x++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(3);
			}
			System.out.println(" ");
		}
	}

}
