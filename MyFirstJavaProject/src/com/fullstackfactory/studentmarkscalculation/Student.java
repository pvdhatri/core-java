package com.fullstackfactory.studentmarkscalculation;

public class Student {
	
	String name;
	int rollNum;
	String standard;
	int marksInMat, marksInEng, marksInSci;
	int totalMarks;
	String pass, fail;
	
	public void printStudentMarksandStatus() {
		System.out.println("Student name : "+name+"\nStudent rollNum : "+rollNum+"\nStudent Std : "+standard+"\nStudent marks in Maths : "+marksInMat+"\n"
				+ "Student marks in English : "+marksInEng+"\nStudent marks in Science : "+marksInSci);
		
		if(marksInMat > 0 & marksInEng > 0 & marksInSci > 0) {
			totalMarks = marksInMat + marksInEng + marksInSci;
			System.out.println("Sum of all the 3 subjects marks is : "+totalMarks+"\nStudent status : pass");
		} else {
			totalMarks = marksInMat + marksInEng + marksInSci;
			System.out.println("Sum of all the 3 subjects marks is : "+totalMarks+"\nStudent status : fail");
		
		}
	}
}
