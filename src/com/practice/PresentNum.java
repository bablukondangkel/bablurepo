package com.practice;

public class PresentNum {

	public static void main(String[] args) {
		int a=34;
		boolean flag=false;
		int[] ar=new int[] {1,4,6,8,12};
		for(int i=0;i>=ar.length;i++) {
			if(ar[i]==a) {
				flag=true;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("number is present="+a);
		}else {
			System.out.println("number is not present="+a);
		}
	}

}
