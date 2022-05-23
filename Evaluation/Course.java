package com.Evaluation;
import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	 
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	void displayCourseDetails() {
		System.out.println("course id is "+courseId);
		System.out.println("Course Name is "+courseName);
		System.out.println("Course Name is "+courseFee);
	}
	
	void authenticate(String username,String password) {
		if(username=="admin" || password=="1234") {
			Course c=new Course();
			c.setCourseId(101);
			c.setCourseName("Lucifer");
			c.setCourseFee(5000);
			c.displayCourseDetails();
//			System.out.println("Good");
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		Course c=new Course();
//		c.authenticate("admin","1234");
//		System.out.println("Enter the username");
//		String us=sc.next();
//		System.out.println("Enter the password");
//		String pass=sc.next();
		c.authenticate("admin","1234");
	}
}
