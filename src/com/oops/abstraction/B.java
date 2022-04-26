package com.oops.abstraction;

public class B extends Marks {
	int english;
	int hindi;
	int computer;
	int math;
	int totalmark;
	
	public B(int english,int hindi,int math,int computer,int totalmark) {
		this.english=english;
		this.hindi=hindi;
		this.math=math;
		this.computer=computer;
		this.totalmark=totalmark;
		}

	public int getPercentage() {
		int markobtained = english + hindi + computer + math;
		int per2 = (markobtained*100) / 400;
		return per2;
	}
}