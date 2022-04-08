package com.oops.abstraction;

public class Area extends Shape{
	public void RectangleArea(int length,int breadth) {
		int var3=length*breadth;
		System.out.println("area of a rectangle:"+var3);
	}
	public void SquareArea(int side) {
		int var2=side*side;
		System.out.println("area of a square:"+var2);
	}
	public void CircleArea(int radius) {
		double var4=3.14*radius*radius;
		System.out.println("area of a circle"+var4);
		
		
	}
	

}
