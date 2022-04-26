package com.oops.abstraction;

public class Result {
	public static void main(String[] args) {
		B obj1=new B(98,96,97,96, 400);
		A obj2=new A(78, 26, 34, 55, 400,"fail");
		A obj3= new A(26, 25, 99, 67, 400,"fail");
		System.out.println("Percentage of student B: "+obj1.getPercentage());
		System.out.println("percentage of student A:"+obj2.getPercentage());
		System.out.println("percentage of 2nd student A: "+obj3.getPercentage());
	}
}
