package com.oops.allinone;

public class ENT extends HospitalAdministration{
	
	
	public ENT(int noOfEmployees, String nameOfHospital, int noOfStaff) {
		super(noOfEmployees, nameOfHospital, noOfStaff);
	}
		
	public String departmentHead() {
		String deptHead = "bablu kondangkel";
		return deptHead;
	}
	private int NoOfEmployees() {
		int f=10;
		return f;
		
	}
	protected int NoofStaff() {
		int s=32;
		return s;
	}
	


}
