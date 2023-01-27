package com.Practice2;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Manager mng = new Manager();
		emp.name = "Sheikh";
		emp.age = 23;
		emp.phoneNo= 700;
		emp.Address = "Patia";
		emp.salary=10000;
		
		mng.name = "Babu";
		mng.age = 24;
		mng.phoneNo= 800;
		mng.Address = "Patia";
		mng.salary=20000;
		
		System.out.println("Name of Employee is:"+emp.name);
		System.out.println("Age of Employee is:"+emp.age);
		System.out.println("Phone no. of Employee is:"+emp.phoneNo);
		System.out.println("Address of Employee is:"+emp.Address);
		System.out.println("Salary of Employee is:"+emp.salary);
		
		System.err.println();
		
		System.out.println("Name of Manager is:"+mng.name);
		System.out.println("Age of Manager is:"+mng.age);
		System.out.println("Phone no. of Manager is:"+mng.phoneNo);
		System.out.println("Address of Manager is:"+mng.Address);
		System.out.println("Salary of Manager is:"+mng.salary);
	}
	
}
