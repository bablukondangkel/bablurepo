package com.practice;

public class GradeMark {
	public static void main(String[] arg) {
		int marks=60;
		
		if(marks<100 && marks>=90) {
			System.out.println("grade:A");
		}
		else if(marks<90 && marks>=80) {
			System.out.println("grade:B");
		}
		else if(marks<80 && marks>=70) {
			System.out.println("grade:c");
		}
		else if(marks<70 && marks>=60) {
			System.out.println("grade:D");
		}
		else if(marks>0 && marks<60) {
			System.out.println("grade:f");
		}
		
	}

}
