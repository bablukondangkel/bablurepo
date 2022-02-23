package com.practice;

public class LeapYear {
	public static void main(String[] arg) {
		int year=2020;
		if(year%4==0 && year%100!=0) {
			System.out.println("year is leap:");
		}else {
			System.out.println("year is not leap:");
		}
		
	}

}
