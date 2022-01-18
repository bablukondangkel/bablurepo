package com.practice;

public class Company {
	Empolyee obj =new Empolyee();
	


	public static void main(String[] args) {
		Company obj1 =new Company();
		System.out.println(obj1.obj.employeeId);
		System.out.println(obj1.obj.empolyeeName);
		System.out.println(obj1.obj.empolyeeAge);
		System.out.println(obj1.obj.empolyeeAddress);
	}


}