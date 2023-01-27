package com.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class OddnuminArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12, 34, 56, 45, 14, 35, 16));

		for(int j=0; j<ar.size(); j++) {
			if(ar.get(j)%2!=0) {
				System.out.println("number is odd="+ar.get(j));
		}
		
	}
		}
	}
		

