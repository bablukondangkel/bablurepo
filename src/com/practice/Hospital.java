package com.practice;

public class Hospital {
	String hospitalname;
	String address;
	int numofempolyee;
	int  numofdepartdment;

	public void hfd(){
		hospitalname="TMH";
		address="Patia";
		numofempolyee=23;
		numofdepartdment=56;
	}
	public Hospital() {
		System.out.println(hospitalname);
		System.out.println(address);
		System.out.println(numofempolyee);
		System.out.println(numofdepartdment);
	}
}
