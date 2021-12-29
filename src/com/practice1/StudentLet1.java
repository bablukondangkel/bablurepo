package com.practice1;

public class StudentLet1 {
	public static void main(String[] arg) {
		int a=12;
		int b=23;
		char c = 'A';
		StudentLet1 obj=new StudentLet1();
		int sum = obj.add(a,b);
		System.out.println("Addtion result is: "+sum);
		int subtr = obj.sub(a,b);
		System.out.println("substration result is" +subtr);
		int mul =	obj.multi(a,b);
		System.out.println("multiplication result is" +mul);
		int divi = obj.div(a,b);
		System.out.println("division result is" +divi);
		char sec=obj.sec(c);
		System.out.println("display my: " +sec);
	}
	
	public char sec(char c) {
		char s='A';
		return s;
	}
	public String branch() {
		String bc= "mech";
		return bc;
		
	}
	
	public int add(int m,int n) {
		int result=m+n;
		return result;
	}
	public int sub(int a,int b) {
		int result=a-b;
		StudentLet1 ob = new StudentLet1();
		String ab = ob.name();
		System.out.println(ab);
		return result;
		
	}
	public int multi(int a,int b){
		int result=a*b;
		return result;
		
	}
	public int div(int a,int b){
		int result=a/b;
		return result;
	}
	
	public String name() {
		String nm = "Bablu";
		return nm;
	}

}