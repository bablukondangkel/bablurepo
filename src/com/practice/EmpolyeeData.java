package com.practice;

	public class EmpolyeeData {
		int empolyeeId;
		int empolyeeSalary;
		String empolyeeName;
		String employeeDesignation;
		
	public void setempolyeeId(int empolyeeId) {
		this.empolyeeId=empolyeeId;
		
	}
	public int getempolyeeId() {
		return this.empolyeeId;
		
	}
	public void setempolyeeSalary(int empolyeeSalary) {
		this.empolyeeSalary=empolyeeSalary;
		
		
	}
	public int getempolyeeSalary() {
		return this.empolyeeSalary;
		
		
	}
	public void setempolyeeName(String empolyeeName) {
		this.empolyeeName=empolyeeName;
		
	}
	public String getempolyeeName() {
		return this.empolyeeName;
		
		
	}
	public void setemployeeDesignation(String employeeDesignation) {
		this.employeeDesignation=employeeDesignation;
	}
	public String getemployeeDesignation() {
		return this.employeeDesignation;
		
	}
}