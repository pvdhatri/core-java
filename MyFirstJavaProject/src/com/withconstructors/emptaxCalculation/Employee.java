package com.withconstructors.emptaxCalculation;

public class Employee {
	
	int empId;
	String empName;
	double empSalary;
	static String COMPANY_NAME = "ABC";
	static String COMPANY_CITY = "Hyd";
	static final String COMPANY_PHONE = "9999999999";
	
	// non argument constructor
	public Employee () {
		this.empId = 101;
		this.empName = "Reena";
		this.empSalary = 10000;
	}
	
	// parameterized constructor
	public Employee (int pid, String pname, double psalary) {
		this.empId = pid;
		this.empName = pname;
		this.empSalary = psalary;
	}
	
//	public void printEmployeeTaxCalculation() {
//		if(empSalary > 0.0) {
//			double tax = (empSalary * 10)/100;
//			System.out.println("Company name : "+COMPANY_NAME+"\nCompany city : "+COMPANY_CITY+"\nCompany phone : "+COMPANY_PHONE+"\n"
//					+ "Employee Id : "+empId+"\nEmployee name : "+empName+"\nEmployee Salary : "+empSalary+"\n"
//							+ ""+empName+" has to pay "+tax+"/- as tax per anum");
//		}
		
	//We can send back the tax value to the main method and print it there. So, it's possible using the return type. Here return type for tax is double. so,replace void with double.
	public double printEmployeeTaxCalculation() {
		//It is showing error bcoz you don't have a return statement & it is giving a suggestion. just go with add return statement. And You have to return the tax. not the empId.
		double tax = 0d;
		if(empSalary > 0.0) {
			tax = (empSalary * 10)/100;
			System.out.println("Company name : "+COMPANY_NAME+"\nCompany city : "+COMPANY_CITY+"\nCompany phone : "+COMPANY_PHONE+"\n"
						+ "Employee Id : "+empId+"\nEmployee name : "+empName+"\nEmployee Salary : "+empSalary);
			}
		return tax;
		//it cannot be resolved to a variable bcoz we are declaring the tax inside the above if condition. And if the if condition fails, it can't identify the tax variable.
		//So,you have to give some default value. refer to line 37. And you can remove the double here in line 39.
		// and then go to the main class. We can accept something (tax) refer line 10 there double emptax =.
		//copy this if condition sysout to there.
	}
}