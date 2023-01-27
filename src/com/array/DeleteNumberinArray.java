package com.array;

import java.util.Scanner;

public class DeleteNumberinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int place = sc.nextInt();
		int[] ar1=new int[] {12,45,34,13,54,90,79};
		int[] ar2=new int[ar1.length-1];
	
		for(int i=0; i<place-1; i++) {
			ar2[i]=ar1[i];
	}
		for(int i=place;i<ar1.length;i++) {
			ar2[i-1]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]+" ");
		}
		
	}
}
