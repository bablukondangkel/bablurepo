package com.oops.allinone;

public class Neurology extends HospitalAdministration{

	public Neurology(int noOfEmployees, String nameOfHospital, int noOfStaff) {
		super(noOfEmployees, nameOfHospital, noOfStaff);
	}
	
	public String departmentHead() {
		String deptHead = "babu garnaik";
		return deptHead;
	}
}

