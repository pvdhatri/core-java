package com.fullstackfactory.assignments;

public class EmployeeTaxCalculation {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empId = 001;
		emp.empName = "Dhatri";
		emp.empSalary = 100000;
		emp.printEmployeeTaxCalculation();
		
		
		Employee emp2 = new Employee();
		emp2.empId = 002;
		emp2.empName = "Sairam";
		emp2.empSalary = 200000;
		emp2.printEmployeeTaxCalculation();
		
		Employee emp3 = new Employee();
		emp3.empId = 003;
		emp3.empName = "Sailaja";
		emp3.empSalary = 300000;
		emp3.printEmployeeTaxCalculation();
	}

}
