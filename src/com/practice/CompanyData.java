package com.practice;

public class CompanyData {
	public static void main(String[] arg) {
		EmpolyeeData display=new EmpolyeeData();
		
		display.setempolyeeId(1234);
		display.setempolyeeName("Bablu");
		display.setempolyeeSalary(2323);
		display.setemployeeDesignation("Mech engg");
		System.out.println(display.getempolyeeId());
		System.out.println(display.getempolyeeName());
		System.out.println(display.getempolyeeSalary());
		System.out.println(display.getemployeeDesignation());
	}

}
