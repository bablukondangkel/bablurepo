package com.array;

public class StudentA extends Marks {
	int marks1;
	int marks2;
	int marks3;
	
	public StudentA(int m1,int m2,int m3) {
	this.marks1=m1;
	this.marks2=m2;
	this.marks3=m3;
	
	
	}	
	public float getpercentege() {
		float total=(marks1+marks2+marks3)/(float)(300)*100;
		System.out.println(total);
		return total;
		
	}
		
	}
	
