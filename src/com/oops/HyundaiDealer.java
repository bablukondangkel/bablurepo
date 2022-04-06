package com.oops;

public class HyundaiDealer extends HyundaiManufacture{
		
	int price;
	String dealerName;
	
	public void display() {
		price = 10000000;
		dealerName = "Bablu Automobiles";
		System.out.println(price);
		System.out.println(dealerName);
	}
	
}
