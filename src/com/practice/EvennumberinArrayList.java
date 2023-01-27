package com.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class EvennumberinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12,45,67,24,44));
			for(int i=0; i<ar.size(); i++) {
				if(ar.get(i)%2==0) {
					System.out.println("number is even:"+ar.get(i));
				}
			}
		}

	}


