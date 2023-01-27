package com.array;
import java.util.Scanner;

public class SwitchinDifferntWay {

	public static void main(String[] args) {
		Scanner ar=new Scanner(System.in);
		System.out.println("enter first no");
		int no1=ar.nextInt();
		System.out.println("enter second no");
		int no2=ar.nextInt();
		System.out.println("select symbole(+,-,*,/)");
		String sym=ar.next();
		System.out.println("number is=");
		int res;
		switch(sym){
			case"+":res=no1+no2;
			System.out.println(res);
			break;
			case"-":res=no1-no2;
			System.out.println(res);
			break;
			case"*":res=no1*no2;
			System.out.println(res);
			break;
			case"/":res=no1/no2;
			System.out.println(res);
			break;
			default:System.out.println("invalid symbole");
			break;
			
			
		}
	}

}
