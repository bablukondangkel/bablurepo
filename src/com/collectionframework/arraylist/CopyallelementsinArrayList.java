package com.collectionframework.arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyallelementsinArrayList {
	
	public static void main(String[] args) {
		int place=3;
		int add=99;
		ArrayList<Integer> obj=new ArrayList<>(Arrays.asList(12,34,67,89,45)) ;
		//obj.add(place-1);
		obj.add(place-1,add);
		System.out.println(obj);
			
		}

	}


