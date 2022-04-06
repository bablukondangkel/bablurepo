package com.oops.methodoverriding;

public class Child extends Parent{

	public void display() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {

		Parent obj = new Child();
		obj.display();
		
	}

}
