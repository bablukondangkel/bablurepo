package com.oops.allinone;

public abstract class HospitalAdministration {
	
	public int noOfEmployees;
	public String nameOfHospital;
	public int noOfStaff;
	
		
	public HospitalAdministration(int noOfEmployees, String nameOfHospital, int noOfStaff) {
		this.noOfEmployees = noOfEmployees;
		this.nameOfHospital = nameOfHospital;
		this.noOfStaff = noOfStaff;
		
	}
	//public void HospitalAdministration() {
		
	
	
	public abstract String departmentHead();
	
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	
	public void setNameOfHospital(String nameOfHospital) {
		this.nameOfHospital = nameOfHospital;
	}
	
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	
	public String getNameOfHospital() {
		return nameOfHospital;
	}
	
	public int getNoOfStaff() {
		return noOfStaff;
	}

}
