package com.practice;

public class Oops {
	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.color="blue";
		pen1.type="gel";
		
		pen1.write();
		System.out.println("color of pen is="+pen1.color);
		System.out.println("type of pen is="+pen1.type);
	}

}
