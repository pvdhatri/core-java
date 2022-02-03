package com.fullstackfactory.assignments;

import java.util.Scanner;

public class StudentMarksCalculator {

	public static void main(String[] args) {

		System.out.println("Student marks calculation for the school : "+Student.SCHOOL_NAME);
		
		Student stu1 = new Student();
		double stu1totalMarks = stu1.calculateMarks();
		System.out.println("Student total marks: "+stu1totalMarks);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student name here: ");
		String stu2Name = scan.next();
		System.out.println("Enter the student class here: ");
		int stu2Class = scan.nextInt();		
		Student stu2 = new Student(stu2Name, stu2Class, 40, 50, 60);
		double stu2totalMarks = stu2.calculateMarks();
		System.out.println("Student total marks: "+stu2totalMarks);
	}

}

