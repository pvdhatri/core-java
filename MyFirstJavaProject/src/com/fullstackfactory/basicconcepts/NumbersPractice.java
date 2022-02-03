package com.fullstackfactory.basicconcepts;

import java.util.Scanner;

public class NumbersPractice {

	public static void main(String[] args) {

		
		 int a = 3; 
		 Integer y = 4; // here y will become an object for this class. you
		 //can convert a integer value into a byte value by calling this y. method. 
		 byte b= y.byteValue(); 
		 double d = y.doubleValue();
		 

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String gpaString = scan.next();
		System.out.println("intSring value : " + gpaString);

		double gpa = Double.valueOf(gpaString);
		System.out.println("gpa double value : " + gpa);
		int x = 10;
		if (y.compareTo(10) == -1) {

		} else if (y.compareTo(10) == 0) {

		}else {
			
		}
		System.out.println("Math.pow() :"+Math.pow(2, 2));
		// int stringToInt = Integer.valueOf(intString);
		// System.out.println("stringToInt value : "+stringToInt);
	}

}
