package com.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbersInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(12, 11, 5 , 7 ,9, 10, 4, 8));
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)%2 ==0) {
				System.out.println(list.get(i));
			}
		}
		
	}

}
