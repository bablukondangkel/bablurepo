package com.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); 
		list.add(20); 
		list.add(30);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}