package com.practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DeletenumberinArrayList {

	public static void main(String[] args) {
		int num = 30;
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(10,20,30,40,50));
		int place=2;
		ar.remove(place-1);
		ar.add(70);
		ar.add(place-1,90);
		System.out.println(ar);
		
	}
}

