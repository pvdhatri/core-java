package com.fullstackfactory.assignments;

import java.util.Scanner;

public class BusTicketBookingApp {

	public static void main(String[] args) {
		
		System.out.println("***WELCOME TO SAFERIDES BUS TICKET BOOKING APPLICATION***");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the respective alphabet you want to travel in from the below list of buses:"
				+ "\na. Orange Travels\nb. Indira Travels\nc. JBT Travels");
		char travelCompany = scan.next().charAt(0);
		if(travelCompany == 'a') {
			System.out.println("The ticket price for 1 seat in Organge Travels is: "+Bus.ORANGE_TRAVELS_PRICE);
			System.out.println("Please enter the number of seats you want to book");
			int noOfSeats = scan.nextInt();
			double totalSeatsPrice = noOfSeats * Bus.ORANGE_TRAVELS_PRICE;
			System.out.println("Your final booking price for the Orange Travels is: "+totalSeatsPrice);
			}
		else if(travelCompany == 'b') {
			System.out.println("The ticket price for 1 seat in Indira Travels is: "+Bus.INDIRA_TRAVELS_PRICE);
			System.out.println("Please enter the number of seats you want to book");
			int noOfSeats = scan.nextInt();
			double totalSeatsPrice = noOfSeats * Bus.INDIRA_TRAVELS_PRICE;
			System.out.println("Your final booking price for the Orange Travels is: "+totalSeatsPrice);
			}
		else if(travelCompany == 'c') {
			System.out.println("The ticket price for 1 seat in JBT Travels is: "+Bus.JBT_TRAVELS_PRICE);
			System.out.println("Please enter the number of seats you want to book");
			int noOfSeats = scan.nextInt();
			double totalSeatsPrice = noOfSeats * Bus.JBT_TRAVELS_PRICE;
			System.out.println("Your final booking price for the Orange Travels is: "+totalSeatsPrice);
			}
		else{
			System.out.println("Your enter is invalid");
			}
	}

}
