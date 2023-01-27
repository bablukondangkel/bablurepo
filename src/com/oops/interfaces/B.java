package com.oops.interfaces;

public class B implements A{
	int x=20;
	public void m1() {
		System.out.println("one");
	}
	public void m2() {
		System.out.println("Two");
		
	}
public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
}	
}