package com.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;	

public class OddnumberinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,34,12,5,7,3,11,15,18));
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i)%2!=0) {
					System.out.println(list.get(i));
					
				}
			}
			
		}

	}
