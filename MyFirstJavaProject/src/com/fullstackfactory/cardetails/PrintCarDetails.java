package com.fullstackfactory.cardetails;

public class PrintCarDetails {

	public static void main(String[] args) {
		
		Car honda = new Car();
		honda.name = "i20";
		honda.brand = "Honda";
		honda.color = "black";
		honda.printCarDetails();
		
		Car inova = new Car();
		inova.name = "Balano";
		inova.brand = "inova";
		inova.color = "white";
		inova.printCarDetails();

	}

}
