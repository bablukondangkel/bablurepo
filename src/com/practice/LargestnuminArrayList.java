package com.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class LargestnuminArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12, 120,34,56,34,99,100)) ;
		int num=ar.get(0);
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i)>num) {
				num=ar.get(i);
			}
		}
		System.out.println(num);
	}

}
