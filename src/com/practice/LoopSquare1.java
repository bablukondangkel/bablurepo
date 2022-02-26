package com.practice;

public class LoopSquare1 {
	public static void main(String[] arg) {
		int num=4;
		boolean flag = false;
		for(int i=1;i<=num;i++) {
			if(i*i==num){
				flag = true;
			}
			
		}
		if(flag==false){
			System.out.println("number is not perfect");
		}else {
			System.out.println("number is perfect");
		}
	}

}
