package com.array;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;//Two Variable;
		int max;//This variable is for store the first answer;
		for(int i=1; i<=10; i++) {
			max=a+b;//Here the value of a and value of b will added and answer will shifted into max; 
			a=b;//here value of b is swap into a;
			b=max;//here value of max is swap into b;
			System.out.println(max);
		}
	}

}
