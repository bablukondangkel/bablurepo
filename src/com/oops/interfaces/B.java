package com.oops.interfaces;

public class B implements A{
	int x=20;
	public void m1() {
		System.out.println("one");
	}
public static void main(String[] args) {
	A a=new B();
	a.m1();
	System.out.println(a.x);
}	
}