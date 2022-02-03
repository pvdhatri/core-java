package com.fullstackfactory.studentmarkscalculation;

public class StudentMarksCalculation {

	public static void main(String[] args) {
		
		Student student1 = new Student();
			student1.name = "Dhatri";
			student1.rollNum = 1;
			student1.standard = "4th std";
			student1.marksInMat = 90;
			student1.marksInEng = 90;
			student1.marksInSci = 90;
			student1.printStudentMarksandStatus();
			
			
		Student student2 = new Student();
			student2.name = "Teena";
			student2.rollNum = 2;
			student2.standard = "4th std";
			student2.marksInMat = 0;
			student2.marksInEng = 40;
			student2.marksInSci = 50;
			student2.printStudentMarksandStatus();
	}

}
