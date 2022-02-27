package com.practice;

public class FiteenLoop {

	public static void main(String[] args) {
		int v=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(v*v +" ");
				v++;
	
			}
			System.out.println();
		}

	}

}
