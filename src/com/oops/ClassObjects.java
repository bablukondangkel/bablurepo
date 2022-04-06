package com.oops;

public class ClassObjects {

	public int a = 10;
	String b = "random";
	
	protected void display() {
		String c = "20";
		System.out.println(a);
		System.out.println(c);
	}
	
	public void show() {
		display();
		System.out.println(b);
	}
	
	public String getName() {
		return b ;
	}

}
