package com.practice;
import java.util.Scanner;

public class InputinScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter phone number:");
		long phone=sc.nextLong();
		System.out.println();
		System.out.println("Name"+name);
		System.out.println("Gender"+gender);
		System.out.println("Age"+age);
		System.out.println("Phone number"+phone);
		
		
		

	}

}
