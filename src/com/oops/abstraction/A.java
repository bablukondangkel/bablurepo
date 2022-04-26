package com.oops.abstraction;

public class A extends Marks {
	int Math;
	int Hindi;
	int English;
	int science;
	int totalmark;
	String fail;
	
	
	public A () {
		
	}
	
	public A(int Math, int Hindi, int English, int science, int totalmark,String fail) {
		this.fail=fail;
		this.Math = Math;
		this.Hindi = Hindi;
		this.English = science;
		this.totalmark = totalmark;
		this.science = science;
	}
	
	
	
	public int getPercentage() {
		int markobtained=Math+Hindi+English+science;
		int per1=(markobtained * 100)/totalmark;
		return per1;
		

		
	}

}
