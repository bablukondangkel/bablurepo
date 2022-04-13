package com.oops.interfaces;

public interface Colleage extends Canteen {
	public default void principalname() {
		System.out.println("principal:Rahul singh");
		
	}
	public void subject();
}
