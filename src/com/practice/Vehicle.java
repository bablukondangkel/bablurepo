package com.practice;

public class Vehicle {
	CarModels car=new CarModels();

	public static void main(String[] arg) {
		Vehicle vech=new Vehicle();
		vech.CarNumber();
		vech.CarBrand();
		vech.CarFuel();
		vech.CarModel();

	}
	public void CarNumber(){
		System.out.println(car.CarNumber);
	}
	public void CarModel() {
		System.out.println(car.CarModel);
		
		}
	public void CarBrand(){
		System.out.println(car.CarBrand);
	}
	public void CarFuel(){
		System.out.println(car.CarFuel);
		
		}
	}
