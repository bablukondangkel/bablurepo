package com.Practice2;

	public class EvenLoop {
		public static void main(String[] arg) {
			int num;
			int num2;
			for(num=1; num<=100; num++) {
				if(num%2==0) {
					System.out.println("Even: "+num);
				}else {
					System.out.println("Odd: "+num);
				}
			}
		}

}
