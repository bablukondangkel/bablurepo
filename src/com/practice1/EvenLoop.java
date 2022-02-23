package com.practice1;

	public class EvenLoop {
		public static void main(String[] agr) {
		    int num=1;
			int max =1;
			for(num=1; num<=100; num++){
				if(num%2 == 0 && num%6==0) {
					max = num;
			}
			}
				
			System.out.println(max);
	 
		
			
	}

}
