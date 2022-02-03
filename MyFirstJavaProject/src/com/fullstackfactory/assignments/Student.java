package com.fullstackfactory.assignments;

public class Student {
	
	String studentName;
	int studentClass;
	int marksInMaths, marksInSci, marksInEng;
	static String SCHOOL_NAME = "Crystal Public School";
	static String SCHOOL_CITY = "Hyderabad";
	static int SCHOOL_PHONE = 123456;
	
	public Student() {
		this.studentName = "Reena";
		this.studentClass = 10;
		this.marksInMaths = 80;
		this.marksInSci = 90;
		this.marksInEng = 90;
	}
	public Student(String pstudentName, int pstudentClass, int pmarksInMaths, int pmarksInSci, int pmarksInEng) {
		this.studentName = pstudentName;
		this.studentClass = pstudentClass;
		this.marksInMaths = pmarksInMaths;
		this.marksInSci = pmarksInSci;
		this.marksInEng = pmarksInEng;
	}
	public double calculateMarks() {
		double totalMarks = 0d;
		
		totalMarks = marksInMaths + marksInSci + marksInEng;
		System.out.println("Student name: "+studentName+"\nStudent Class: "+studentClass+"\n"
				+ "School city: "+SCHOOL_CITY+"\nSchool Phone: "+SCHOOL_PHONE);
		return totalMarks;
			
		}
	}
	
