package com.oops.methodoverriding;

public class Team extends Appartment {
	String Nam1="Babu";
	String Nam2="yogesh";
	String Nam3="Bablu";
	String Nam4="Abhay";
	public void display() {
		System.out.println(Nam1+" "+Nam2+" "+Nam3+" "+Nam4);
		
	}
	
public static void main(String[] args) {
	Appartment obj=new Team();
		//obj.display();
	
	Flat obj1 = new Team(); 
	obj1.display();

	}

}
