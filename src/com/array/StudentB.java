package com.array;

public class StudentB extends Marks{
	int marks1;
	int marks2;
	int marks3;
	int marks4;
	
	public  StudentB(int m1,int m2,int m3,int m4 ) {
		this.marks1=m1;
		this.marks2=m2;
		this.marks3=m3;
		this.marks4=m4;
		
		
	}
	public float getpercentege() {
		float total=(marks1+marks2+marks3+marks4)/(float)(400)*100;
		System.out.println(total);
		return total;
		
	}
	
}
