package com.practice;

public class PracticeJava {

	public static void main(String[]arg) {
		int a=6;
		int b=5;
		PracticeJava obj=new PracticeJava();
		obj.multi(a,b);
		obj.div(a,b);
		obj.sub(a,b);
		obj.add(a,b);
		
	}
	public void multi(int a,int b) {
		int result=a*b;
		System.out.println("multiplication result is:"+result);
	
	}
	public void div(int a,int b) {
		int result=a/b;
		System.out.println("division result is:" +result);
		
	}
	public void sub(int a,int b) {
		int result=a-b;
		System.out.println("substration result is:" +result);
		
	}
	public void add(int a,int b) {
		int result=a+b;
		System.out.println("addition result is:" +result);
	}
	
}
