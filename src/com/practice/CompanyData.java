package com.practice;

public class CompanyData {
	public static void main(String[] arg) {
		EmpolyeeData display=new EmpolyeeData();
		
		display.setempolyeeId(1234);
		System.out.println(display.getempolyeeId());
		display.setempolyeeName("Bablu");
		System.out.println(display.getempolyeeName());
		display.setempolyeeSalary(2323);
		System.out.println(display.getempolyeeSalary());
		display.setemployeeDesignation("Mech engg");
		System.out.println(display.getemployeeDesignation());
	}

}
