package com.practice;
import java.util.Scanner;

public class SuminArray {

	public static void main(String[] args) {
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		System.out.println("Enter numbers is array:");
		
		for(int i=0; i<ar.length; i++) {
			ar[i]=sc.nextInt();
			num=num+ar[i];
		}
		System.out.println("The sum of total number:");
		System.out.println(num);
	}

}
