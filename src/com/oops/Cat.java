package com.oops;

public class Cat extends  AnimalInherit {//this class is called child class  and sub class.this class is extends by class AnimalInherit);

	public static void main(String[] args) {
		Cat obj=new Cat ();//this object is from child class;
		obj.dog();//this dog method is from parents class;
		obj.cat();//this cat method is from parents class;
		obj.rusp();//this rusp is from child class;
	}
	public void rusp() {
		int q=14,b=12;
		int sum;
		sum=q+b;
		System.out.println("sum of two number:"+sum);
	}

}
