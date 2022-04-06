package com.oops;

public class MethodOverLoad {
	
	public void Display(int a) {
		System.out.println(a);
	}
	public void Display(int a,int b) {
		System.out.println(a+", "+b); 
	}
	public void Display(String a) {
		System.out.println(a);
	}
	public void Display(float c) {
		System.out.println(c);
	}
	public void Display() {
		System.out.println("No Argument");
	}
//	public void Display() {
//		int x=10, y=20, sum;
//		sum= x+y;
//		System.out.println("Some example"+sum);
//	}

}
