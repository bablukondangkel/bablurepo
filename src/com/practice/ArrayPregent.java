package com.practice;

public class ArrayPregent {
	public static void main(String[] arg) {
		int j=2;
		boolean flag = false;
		int[] ar=new int[] {2,5,8,9,12};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==j) {
				flag = true;
				break;
			}
			
		}
		if(flag == true){
			System.out.println("number is present="+j);
		}else {
			System.out.println("number is not present="+j);
		}
			
		}
	}


