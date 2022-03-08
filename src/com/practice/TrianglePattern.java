package com.practice;

public class TrianglePattern {
	public static void main(String[] arg) {
		int i,j,x=7;
		for(i=0;i<=x;i++) {
			for(j=x-i;j>=1;j--) {
				System.out.print( " "+" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print(  " "+"*"+" "+" ");
	
		}
			System.out.println();
	}
	
}
}