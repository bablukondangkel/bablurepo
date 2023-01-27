package com.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimenuminArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>(Arrays.asList(12, 15, 16, 17, 8, 19));
		
		for(int i=0; i<obj.size(); i++) {
			int count=0;
			
		for(int j=1; j<obj.size(); j++ ) {
			if(obj.get(i)%j==0) {
				count++;
				
			}
			
		}
		if(count<=2) {
			System.out.println(obj.get(i));
		}
			
		}
	}

}
