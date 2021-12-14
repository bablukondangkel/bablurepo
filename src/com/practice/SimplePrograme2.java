package com.practice;

public class SimplePrograme2 {
	public static void main(String[] arg) {
		SimplePrograme1 obj=new SimplePrograme1();
	    int a=23,b=34;
	    
		int res = obj.multi(a,b);
		System.out.println(res);
		obj.sub(a, b);
		obj.div(a, b);
		
	}		

}
