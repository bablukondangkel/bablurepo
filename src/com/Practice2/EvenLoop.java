package com.Practice2;

	public class EvenLoop {
		public static void main(String[] arg) {
			int num;
			for(num=1; num<=100; num++) {
				if(num%2==1) {
					System.out.println("Even: "+num);
				}else {
					System.out.println("Odd: "+num);
				}
			}
		}

}
