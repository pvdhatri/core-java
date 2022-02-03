package com.fullstackfactory.assignments;

public class Employee {
	
	int empId;
	String empName;
	double empSalary;
	
	public void printEmployeeTaxCalculation() {
		if(empSalary > 0.0) {
			double tax = (empSalary * 10)/100;
			System.out.println("Employee Id : "+empId+"\nEmployee name : "+empName+"\nEmployee Salary : "+empSalary+"\n"+empName+" has to pay "+tax+"/- as tax per anum");
		}
	}

}
