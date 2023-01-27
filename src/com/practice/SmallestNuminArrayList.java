package com.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class SmallestNuminArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(10,23,35,67,9));
		int num=ar.get(0);
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i)<num) {
				num=ar.get(i);
			}
		}
		System.out.println(num);
	}

}
