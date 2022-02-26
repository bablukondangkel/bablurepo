package com.practice;

public class FullName {
	public static void main(String[] arg) {
		String firstname="Bablu";
		String middlename="n/a";
		String lastname="Kondangkel";
		FullName obj=new FullName();
		String flname = obj.name(firstname, middlename, lastname);
		System.out.println(flname);
		
		
	}
	public String name(String fname, String mName, String lName) {
		String fullname=fname + " " + mName + " " + lName ;
		
		return fullname;
		
	}
}
		
	
	
		
	
