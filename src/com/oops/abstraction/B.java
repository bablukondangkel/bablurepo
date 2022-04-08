package com.oops.abstraction;

public class B extends Marks {
	int english;
	int hindi;
	int computer;
	int math;
	int totalmark;
	
// 	public B() {
//		english = 78;
//		hindi = 65;
//		math = 39;
//		computer = 25;
//		totalmark = 400;
//	}

	public int getPercentage() {
		int markobtained = english + hindi + computer + math;
		int per2 = (markobtained*100) / 400;
		return per2;
	}
}