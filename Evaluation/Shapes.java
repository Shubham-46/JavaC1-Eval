package com.Evaluation;

public class Shapes {
	public void area(int radius) {
		Circle c=new Circle();
		c.circle(radius);
	}
	public void area(int length,int breadth) {
		Rectangle r=new Rectangle();
		r.rectangle(length,breadth);
	}
	public void area(double side) {
		Square s=new Square();
		s.square(side);
	}
}	
class Circle{
	int radius;
	void circle(int radius) {
		double c=0;
		c=2*3.14*radius;
		System.out.println("Your radius is "+c);
	}
}
class Rectangle{
	int length;
	int breadth;
	void rectangle(int length,int breadth) {
		double s=0;
		s=length*breadth;
		System.out.println("Your rectangle is "+s);
	}
}
class Square{
	double side;
	void square(double side) {
		double sq=0;
		sq=side*side;
		System.out.println("Square is "+sq);
	}
}
class Main2{
	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.area(5);
		s.area(10, 10);
		s.area(10.0);
		
	}
}