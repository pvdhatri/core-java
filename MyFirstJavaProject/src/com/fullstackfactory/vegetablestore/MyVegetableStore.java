package com.fullstackfactory.vegetablestore;

import java.util.Scanner;

import com.fullstackfactory.service.VegetableService;
import com.fullstackfactory.utilities.CommonConstantsForVegetableStore;

public class MyVegetableStore extends VegetableService{ //here myVegetableStore is a sub class now. and VegetableService is a parent class.
	//public class MyVegetableStore { //the actual line is this one and, we are using extends in the above line to inherit states and behaviors based on the visibility that you have (the protected method from the VegetableService class).
                                      //even though you are inheriting, you can't access the private and default methods or variables.You'llbe able to access only public or protected.
	                                  // we know that public can be accessed without the inheritance. but for protected, to utilize it from a different package, you need to inherit that class. and if it is protected method you want to write a override it basically. see below.
	public MyVegetableStore() {
		
	}
	public MyVegetableStore(String name, int qty) {
		//if i wanted to call a parent class parameterized constructor from this constructor. we use super of and pass name, qty.
		super(name, qty);
		// and whenever you are trying to create this object (myStore), you just have to pass the parameters (vegName, quantity) into this myStore.
	}
	
	public static void main(String[] args) { // we are using static so that whatever the operations will go inside this, the memory allocation will happen only once for those operations. All the operations will happen within that space only. if we don't use static then memory allocation will happen each and every time.
		
		System.out.println("Welcome to Dhatri's Vegetable Store");
		System.out.println("Please choose a Vegetable from the below list:");
		System.out.println(CommonConstantsForVegetableStore.TOMATOS+"\n"+CommonConstantsForVegetableStore.POTATOS+"\n"+CommonConstantsForVegetableStore.BEANS+"\n"+CommonConstantsForVegetableStore.ONIONS);
		System.out.println("Please enter your choice here:");
		Scanner scan = new Scanner(System.in);
		String vegName = scan.next();
		System.out.println("Enter your required quantity here:");
		int reqQuantity = scan.nextInt();
		//VegetableService vegService = new VegetableService(vegName, reqQuantity); // this is when we change the instance variables from public to private.
		//or VegetableService vegService = new VegetableService(); this one is when we change the instance variables from private to public and removed parameters in the checkAvailableQuantity method in the VegetableService class.
		//vegService.vegetableName = vegName;
		//vegService.reqQuantity = reqQuantity;
		//vegService. (if you type this and see you are not able to see the print purchase details method yet. but how you'll be able to invoke that method to print the purchase details means, you have to create one object for this self class.
		MyVegetableStore myStore = new MyVegetableStore(vegName, reqQuantity);
		double totalPrice = myStore.checkAvailableQuantity();
		myStore.printPurchaseDetails(); // this object will invoke the method that is created(line 40) inside this class. 
		if(totalPrice != 0d) {
			System.out.println("Your total price is: "+totalPrice);
		}
		else {
			System.out.println("Sorry we are running out of quantity. Please choose another vegetable");
		}
		//vegService.calculateTotalPrice(reqQuantity, 30d);
	}
	@Override
	protected void printPurchaseDetails() {
		//if you want to represent a parent object inside this subclass then you have something called super.
		super.printPurchaseDetails();
	}
}
