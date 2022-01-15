package com.practice;

public class Company {
	
	Empolyee obj=new Empolyee();
	
	public static void main(String[] args) {
		Company company = new Company();
		company.displayEmployeeId();
		company.displayEmployeeName();
		company.displayEmployeeAge();
		company.displayEmployeeAddress();
	}
	
	public void displayEmployeeId() {
		System.out.println(obj.employeeId);
		
	}
	
	public void displayEmployeeName() {
		System.out.println(obj.empolyeeName);
		
	}
	
	public void displayEmployeeAge() {
		System.out.println(obj.empolyeeAge);
		
	}
	
	public void displayEmployeeAddress() {
		System.out.println(obj.empolyeeAddress);
		
	}
	

}
