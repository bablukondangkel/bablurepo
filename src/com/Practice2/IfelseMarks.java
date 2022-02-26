package com.Practice2;

	public class IfelseMarks {
		public static void main(String[] arg) {
			int marks=27;
			if(marks>=90 || marks<=100) {
				System.out.println("grade A");
			}
			else if(marks>=80 || marks<=90) {
				System.out.println("marks is grade B");
				
			}
			else if(marks>=70 || marks<=80){
				System.out.println("marks is grade c");
				
			}
			else if(marks>=60 || marks<=70){
				System.out.println("marks is grade D");
			}
			else {
				System.out.println("fail");
			}
	}
	}
