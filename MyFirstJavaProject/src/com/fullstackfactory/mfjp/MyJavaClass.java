package com.fullstackfactory.mfjp;

public class MyJavaClass {

	public static void main(String[] args) {
		System.out.println("Welcome to the Full Stack Factory");
		
//		int x = 5;
//		int y = 5;
//		int z = x+y;
//		System.out.println("Sum of x and y is "+z);
//		System.out.println("Sum of "+x+" and "+y+" is "+z);
		
		for(int i=1;i<=25;i++) {
			if(i%2 == 0) {
				System.out.println("\nEven numbers from 1 to 25 are " +i);
			}
		}
		for(int i=1;i<=25;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}

	}

}
