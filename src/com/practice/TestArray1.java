package com.practice;

public class TestArray1 {
	public static void main(String[] arg) {
		int[] ar=new int[] {33,3,4,5};
		System.out.println("printing original array:"); 
		for(int i:ar)
			System.out.println(i);
		System.out.println("printing clone of the array"); 
		int carr[]=ar.clone();
			for(int i:carr) 
				System.out.println(i);
			System.out.println("are both equal?");
			System.out.println(ar==carr); 
		}
	}

	
