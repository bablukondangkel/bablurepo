package com.practice1;

public class StudentLet1 {
	public static void main(String[] arg) {
		int a=12;
		int b=23;
		StudentLet1 obj=new StudentLet1();
		int sum = obj.add(a,b);
		System.out.println("addidation result is" +sum);
		int subtr = obj.sub(a,b);
		System.out.println("substration result is" +subtr);
		int mul =	obj.multi(a,b);
		System.out.println("multiplication result is" +mul);
		int divi = obj.div(a,b);
		System.out.println("division resukt is" +divi);
		
		
	}
	
	public int add(int a,int b) {
		int result=a+b;
		return result;
	}
	public int sub(int a,int b) {
		int result=a-b;
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

}