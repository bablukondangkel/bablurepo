package com.oops.interfaces;

public interface Canteen {
	
	void canteenName();
	
	default void foodType() {
		System.out.println("Veg and NonVeg");
	}

}
