package com.oops.interfaces;

public class Army implements Defense{
	public void displayNoOfStaff() {
		int b=23;
		System.out.println("no of staff in Army:"+b);
	}
	public static void main(String [] arg) {
		Army obj1=new Army();
		obj1.displayNoOfStaff();
		obj1.Superkey();
	}
}