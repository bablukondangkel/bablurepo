package com.oops.interfaces;

public interface Defense {
	
	public void displayNoOfStaff();
	public default void Superkey() {
		System.out.println("President: Ram Nath Kovind");
	}

}
