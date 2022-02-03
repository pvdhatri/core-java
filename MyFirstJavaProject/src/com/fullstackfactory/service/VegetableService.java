package com.fullstackfactory.service;

import com.fullstackfactory.utilities.CommonConstantsForVegetableStore; //this is called fully qualified name. representing your class name along with package name(address).

public class VegetableService {
	private String vegetableName; 
	private int reqQuantity; //we have changed from public to private and in the main class we can even access this variables by passing them as arguments in the object creation.
	double totalPrice; //Here we didn't mention any access modifier(public, private, protected). So this particular variable scope is default. Means java will consider it as default modifier. And it is visible within the package.
	
	public int TOMATOS_QUANTITY = 5; 
	public int POTATOS_QUANTITY = 5; 
	public static int BEANS_QUANTITY; 
	public static int ONIONS_QUANTITY; //Just doing Declaration. Initialization is happening inside the static block.
	
	static {
		BEANS_QUANTITY = 5;
		ONIONS_QUANTITY = 5;
	}
	//or
	//{
		//BEANS_QUANTITY = 5;
		//ONIONS_QUANTITY = 5;
	//}
	
	public VegetableService() {
		
	}
	
	public VegetableService(String vegetableName, int reqQuantity) {
		super(); //super method basically will call the parent class constructor if there is any. Since there is no parent class for this child class, this super() doesn't have any meaning.
		this.vegetableName = vegetableName;
		this.reqQuantity = reqQuantity;
	}
	
	public double checkAvailableQuantity() {  //We are removing these parameters (String vegetableName, int reqQuantity) from this method. Since we have removed the arguments for checkAvailableQuantity in the main class.
		double totalPrice = 0d;
		if(vegetableName.equalsIgnoreCase(CommonConstantsForVegetableStore.TOMATOS)) {
			if(reqQuantity <= TOMATOS_QUANTITY) {
				totalPrice= calculateTotalPrice(reqQuantity, CommonConstantsForVegetableStore.TOMATOS_PRICE);
			    if(totalPrice > 0d) {
			    	System.out.println("Before increment: "+TOMATOS_QUANTITY);
			    	TOMATOS_QUANTITY = ++TOMATOS_QUANTITY;
			    	System.out.println("after increment : "+TOMATOS_QUANTITY);
			    }
			}
		}
		if(vegetableName.equalsIgnoreCase(CommonConstantsForVegetableStore.POTATOS)) {
			if(reqQuantity <= POTATOS_QUANTITY) {
				totalPrice= calculateTotalPrice(reqQuantity, CommonConstantsForVegetableStore.POTATOS_PRICE);
			}
		}
		if(vegetableName.equalsIgnoreCase(CommonConstantsForVegetableStore.BEANS)) {
			if(reqQuantity <= BEANS_QUANTITY) {
				totalPrice= calculateTotalPrice(reqQuantity, CommonConstantsForVegetableStore.BEANS_PRICE);
			}
		}
		if(vegetableName.equalsIgnoreCase(CommonConstantsForVegetableStore.ONIONS)) {
			if(reqQuantity <= ONIONS_QUANTITY) {
				totalPrice= calculateTotalPrice(reqQuantity, CommonConstantsForVegetableStore.ONIONS_PRICE);
			}
		}
		
		
		/*
		 * switch (vegetableName) { case CommonConstantsForVegetableStore.TOMATOS :
		 * if(reqQuantity <= TOMATOS_QUANTITY) { totalPrice=
		 * calculateTotalPrice(reqQuantity,
		 * CommonConstantsForVegetableStore.TOMATOS_PRICE); if(totalPrice > 0d) {
		 * System.out.println("Before increment: "+TOMATOS_QUANTITY); TOMATOS_QUANTITY =
		 * ++TOMATOS_QUANTITY;
		 * System.out.println("after increment : "+TOMATOS_QUANTITY); } } break; case
		 * CommonConstantsForVegetableStore.POTATOS : if(reqQuantity <=
		 * POTATOS_QUANTITY) { totalPrice= calculateTotalPrice(reqQuantity,
		 * CommonConstantsForVegetableStore.POTATOS_PRICE); } break; case
		 * CommonConstantsForVegetableStore.BEANS : if(reqQuantity <= BEANS_QUANTITY) {
		 * totalPrice= calculateTotalPrice(reqQuantity,
		 * CommonConstantsForVegetableStore.BEANS_PRICE); } break; case
		 * CommonConstantsForVegetableStore.ONIONS : if(reqQuantity <= ONIONS_QUANTITY)
		 * { totalPrice= calculateTotalPrice(reqQuantity,
		 * CommonConstantsForVegetableStore.ONIONS_PRICE); } break; default :
		 * System.out.println("No matches found"); }
		 */
		
		this.totalPrice = totalPrice; //this local variable value will be assigning to class level variable.
		return totalPrice;
	}
	
	private synchronized double calculateTotalPrice(int reqQuantity, double price) { //synchronize is a non access modifier. if we use synchronize then it is thread safe. Means this method won't be utilized at a time by many requests.
		double totalPrice = reqQuantity * price;
		return totalPrice;
	}
	
	protected void printPurchaseDetails() { //within this same class you can use this protected. But if this class is present in different package and you want to use this protected method in the main class which is present in another package then you need to use extends keyword in the main class.
		System.out.println("Vegetable Name : "+vegetableName+"\nRequested Quantity : "+reqQuantity+"\nPurchase Cost : "+totalPrice);
	}
	
}
