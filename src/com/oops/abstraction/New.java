package com.oops.abstraction;

public class New {

	public static void main(String[] args) {
		Parent1 cast=new Parent1();
		Parent2 obj=new Parent2();
		cast.message();
		System.out.println("This is first subclass");
		obj.message();
		System.out.println("This is second subclass");
	}
	

}
