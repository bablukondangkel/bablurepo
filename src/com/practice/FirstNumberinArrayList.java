package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstNumberinArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>(Arrays.asList("Abhay","Babla","Rahul","Anshuman","Babu","Silu"));
			for(int i=0; i<ar.size(); i++) {
				char ch = ar.get(i).charAt(0);
				System.out.println(ch);
			}
		

	}

}
