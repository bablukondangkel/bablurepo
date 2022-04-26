package com.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 15, 16, 17, 8, 19));

		for (int i = 0; i < list.size(); i++) {
			int count = 0;

			for (int j = 1; j <= list.get(i); j++) {
				if (list.get(i) % j == 0) {
					count++;
				}
			}

			if (count <= 2) {
				System.out.println(list.get(i));

			}
		}
	}
}