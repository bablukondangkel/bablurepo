package com.practice;

public class IncreaseLoop {
	public static void main(String[] arg) {
		for(int j=1;j<=5;j++) {
			for(int x=j;x<=5;x++) {
				System.out.print(" ");
			}
				
			for(int i=1;i<=j;i++) {
				
				System.out.print("* " );
				
			}
			System.out.println();
		}
	}

}
