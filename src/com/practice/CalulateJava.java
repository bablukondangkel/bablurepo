package com.practice;

public class CalulateJava {
	public static void main (String[] arg) {
		int a=6,b=9;
		CalulateJava obj=new CalulateJava();
		 obj.multi(a,b);
		 obj.add(a, b);
		 obj.sub(a,b);
		 obj.div(a, b);
		
	}
	public void multi(int a,int b) {
		int result=a*b;
		System.out.println("multipication result is:" +result);
	}
	public void add(int a,int b) {
		int result=a+b;
		System.out.println("addition result is:"+ result);
	}
	public void sub(int a,int b) {
		int result=a-b;
		System.out.println("substration result is: "+result);
	}
	public void div(int a, int b) {
		int result=a/b;
		System.out.println("division result is:"+result);
	}

}
