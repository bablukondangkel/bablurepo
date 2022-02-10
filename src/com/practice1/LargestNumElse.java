package com.practice1;

	public class LargestNumElse {
		public static void main(String[] arg) {
			int num1=100;
			int num2=100;
			int num3=67;
			
			if(num1>=num2 && num1>=num3) {
				System.out.println("gretest number is:"+num1);
				
			}else if(num2>=num3) {
				System.out.println("grestest number is:" +num2);
				
			}else {
				System.out.println("gretest number is:"+num3);
			}
		}

}
