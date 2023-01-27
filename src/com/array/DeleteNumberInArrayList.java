package com.array;
import java.util.ArrayList;
import java.util.Arrays;

public class DeleteNumberInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12,23,56,78,58,98,10));
		int place=3;
		int num=34;
		ar.add(place,num);
		System.out.println(ar);
			
	}

	}


