package com.oops.abstraction;

public class MainHouse {

	public static void main(String[] args) {
		int var1=10;
		int var2=20;
		int var3=30;
		House2 obj=new House2(var1,var2,var3);
		obj.Build();
		System.out.println(var1+","+var2+","+var3);
	}

}
