package com.practice;

public class Area1 {
	public static void main (String[] arg) {
		int side=5;
		int length=6,breadth=7;
		int radius=8;
		Area1 obj=new Area1();
		obj.square(side);
		obj.rectangle(length, breadth);
		obj.circle(radius);
		
	}
	public void square(int side) {
		int area=side*side;
		System.out.println("area of square is:"+area);
	}
	public void rectangle(int length,int breadth) {
		int area=length*breadth;
		System.out.println("area of rectangle is:"+area);
		
	}
	public void circle(int r) {
		double area=3.14*r*r;
		System.out.println("area of circle is:"+area);
		
		
	}
}
