package com.collectionframework.arraylist;

import java.util.ArrayList;

public class ColourArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("pink");
		list.add("black");
		list.add("orange");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		
		}
	}
}
