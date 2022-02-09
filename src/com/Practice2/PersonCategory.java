package com.Practice2;

	public class PersonCategory {
		public static void main(String[] arg) {
			int age=18;
		
		if(age<18) { 
			System.out.println("person is child");
			
		}
		else if(age>=18 && age<=60) {
			System.out.println("person is adult");
		}
		else {
			System.out.println("person is senior citizen");
		}

}
}