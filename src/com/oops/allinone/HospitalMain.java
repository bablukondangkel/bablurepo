package com.oops.allinone;

public class HospitalMain {

	public static void main(String[] args) {

		ENT obj = new ENT(10, "Utkal Hospital", 37);
		ENT obj2=new ENT();
		System.out.println("no of empolyee:"+obj.NoOfEmployees());
		System.out.println("no of staf:"+obj.getNoOfStaff());
		System.out.println("ENT Head is: "+obj.departmentHead());
		Neurology obj1 = new Neurology(15, "Kalinga Hospital", 45);
		System.out.println("Neurology head is: "+ obj1.departmentHead());
	}

}
