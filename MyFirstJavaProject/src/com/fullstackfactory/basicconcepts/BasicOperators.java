package com.fullstackfactory.basicconcepts;

public class BasicOperators {

	public static void main(String[] args) {
		
								//Arithmetic Operators
		int addition = 5 + 2;
		System.out.println("Adition : "+addition);
		int modulus = 5 % 2;
		System.out.println("Modulus : "+modulus);
		System.out.println("Pre Increment : "+(++addition));
		System.out.println("Addition :"+addition);
		System.out.println("Addition : "+(addition++));
		System.out.println("Post Increment : "+addition);
		System.out.println("Pre Decrement : "+(--addition));
		System.out.println("Addition :"+addition);
		System.out.println("Addition : "+(addition--));
		System.out.println("Post Decrement : "+addition);
		
		//arithmetic operators increment example
		String[] dhatriFrndList = {"sha","sha","puri","lav"};
		int counter = 0;
		for(int i = 0; i < dhatriFrndList.length; i++) {
			String frndName = dhatriFrndList[i] != null ? dhatriFrndList[i] : "empty"; //mislleneous operator. if dhatriFrndList[i] != null is true then dhatriFrndList[i] will execute. otherwise empty will execute.
			if(frndName.equalsIgnoreCase("sha")) {
				counter++;
			}
		}
		System.out.println("Number of friends with name sha : "+counter);
		
								//Relational Operators
		int a1 = 5;
		int b1 = 5;
		if(a1==b1) {
			System.out.println("Both variables are equal");
		}else {
			System.out.println("Both variables are not equal");
		}
		//int a2 = 5;
		//int b2 = 9;
		//if(a2!=b2) {
		//	System.out.println("Both variables are not equal");
		//}else {
		//	System.out.println("Both variables are equal");
		//}
		//int a3 = 15;
		//int b3 = 9;
		//if(a3>b3) {
		//	System.out.println("a3 is greater than b3");
		//}else {
		//	System.out.println("a3 is less tha b3");
		//}
		//int a4 = 15;
		//int b4 = 15;
		//if(a4>=b4) {
			//System.out.println("a4 is greater than or equal to b4");
		//}else {
		//	System.out.println("b4 is greater than a4");
		//}
								//Bitwise Operators
		int a5 = 60;
		int b5 = 13;
		int c5 = a5 & b5;
		System.out.println(c5);
								//Logical Operators
		/*int a6 = 5;
		int b6 = 6;
		//if((a6!=b6) (a6!=5)) // to satisfy both conditions, we use && in between. to satisfy any one we use || in between.
		if((a6!=b6) && (a6!=5)) {
			System.out.println("&& condition is true");
		}else {
			System.out.println("&& condition is false");
		}
		if(!(a6!=b6)) {
			System.out.println("! condition is false");
		}else {
			System.out.println("! condition is true");
		}
								//Assignment Operators
		int var = 10;
		var += a5;
		System.out.println("var value: "+var);*/
								//Miscellaneous Operators
		
		//in dhatriFrndList[i]
								//instanceOf operators
		/*Object object = new Employee(); //Object is the parent class of any other class in java
		if (object instanceOf VegetableService) {
			VegetableService service = (VegetableService) object;
		} else {
			
		*/}
		int value = 7*5+3/2;
		
		
		
	
		
		
	
	}

}