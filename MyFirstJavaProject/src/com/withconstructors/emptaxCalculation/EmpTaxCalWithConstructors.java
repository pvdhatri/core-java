package com.withconstructors.emptaxCalculation;

import java.util.Scanner;

public class EmpTaxCalWithConstructors {

	public static void main(String[] args) {
		
		System.out.println("Employee tax calculation for the company : "+Employee.COMPANY_NAME);
		
		Employee emp = new Employee();
		double emptax = emp.printEmployeeTaxCalculation();
		System.out.println("Employee has to pay "+emptax+"/- as tax per anum");
		
		Scanner scan = new Scanner(System.in);//this will take the dynamic values during the run time.
		System.out.println("Enter the employee Id here :");
		int emp2Id = scan.nextInt();
		System.out.println("Enter the employee Name here :");
		String emp2Name = scan.next();
		Employee emp2 = new Employee(emp2Id, emp2Name, 200000d);
		double emp2tax = emp2.printEmployeeTaxCalculation();
		System.out.println("Employee has to pay "+emp2tax+"/- as tax per anum");
		
		
//		
//		Employee emp3 = new Employee();
//		emp3.empId = 003;
//		emp3.empName = "Sailaja";
//		emp3.empSalary = 300000;
//		emp3.printEmployeeTaxCalculation();

	}

}
