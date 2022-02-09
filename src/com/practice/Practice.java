package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("acc","abb","acb"));
		
		for(int i=0; i< arr.size()-1;i++) {
			StringBuilder s1 = new StringBuilder(arr.get(i));
			StringBuilder s2  = new StringBuilder(arr.get(i+1));
			for(int j=s1.length()-1;j>=0;j--) {
				char ch = s1.charAt(j);
				s1.setCharAt(j, s2.charAt(j));
				s2.setCharAt(j, ch);
				arr.set(i, s1.toString());
				arr.set(i+1, s2.toString());
				if(arr.stream().distinct().count() == 1) {
					System.out.println("Possible");
					break;
				}
			}
		}
		if(arr.stream().distinct().count() > 1) {
			System.out.println("Not possible");
		}
	}
}
