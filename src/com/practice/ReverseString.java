package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String name="BABLU KONDANGKEL";
		int length=16;//This variable is used size of name-length;
		String reverse="";//Store a String output ;
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);//Here the using of name.charAt(i) is represent the name index; 
		}
		System.out.println(reverse);
	}

}
