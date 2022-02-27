package com.practice;

public class Calculator1 {
	public static void main (String[] arg) {
		int num=12,num1=7;
		Calculator1 obj=new Calculator1();
		obj.multi(num,num1);
		obj.add(num, num1);
		obj.sub(num,num1);
		obj.div(num, num1);
	}
	public void multi(int x,int y) {	
		int result = x*y;
		System.out.println("Multiplication result is: "+result);
	}
	public void add(int x,int y) {
	  int result =x+y;
	  System.out.println("addition result is: "+result);
 	}
	public void sub(int x,int y) {
		int result=x-y;
		System.out.println("subtraction result is: "+result);
	  
	}
	public void div(int x,int y) {
	  int result=x/y;
	  System.out.println("division result is: "+result);
	}
}
