package com.array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseNumberList {

	public static void main(String[] args) {
		System.out.println("Reverse number");
		ArrayList<Integer> ar=new ArrayList<> (Arrays.asList(1,2,3));
		for(int i=ar.size()-1; i>=0; i--) {
			
			System.out.println(ar.get(i));
		}
	}

}
