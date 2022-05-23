package com.Evaluation;
import java.util.Scanner;

public class student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	void displayStudent(int rollNumber,String studentName,int marks) {
		System.out.println("student rollNo "+rollNumber);
		System.out.println("student name "+studentName);
		System.out.println("student marks "+marks);
	}
	
	
}
class Main1{
	public static void main(String[] args) {
		student st=new student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of student");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the roll no ");
			int r=sc.nextInt();
			System.out.println("Enter the name ");
			String na=sc.next();
			System.out.println("Enter the marks");
			int ma=sc.nextInt();
			st.displayStudent(r, na, ma);
			
		}
		
	}
}
