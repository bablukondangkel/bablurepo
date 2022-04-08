package com.oops.abstraction;

public class Result {
	public static void main(String[] args) {
		B obj1=new B();
		A obj2=new A(78, 26, 34, 55, 400);
		A obj3= new A(73, 25, 99, 67, 400);
		System.out.println("Percentage of student B: "+obj1.getPercentage());
		System.out.println("percentage of student A:"+obj2.getPercentage());
		System.out.println("percentage of 2nd student A: "+obj3.getPercentage());
	}
}
