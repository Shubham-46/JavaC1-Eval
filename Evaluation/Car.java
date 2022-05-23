package com.Evaluation;

public class Car {
	String model;
	String companyName;
	String Color;
	Engine engine;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	void cardetails() {
		System.out.println("Car model is "+model);
		System.out.println("Car company is "+companyName);
		System.out.println("Car color is "+Color);
	}
	
}
class Engine{
	int rmp;
	int Power;
	String manufacturer;
	boolean hasTurbo;
	
	public int getRmp() {
		return rmp;
	}

	public void setRmp(int rmp) {
		this.rmp = rmp;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean isHasTurbo() {
		return hasTurbo;
	}

	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}

	void displayCar(){
		Engine e=new Engine();
		e.setHasTurbo(true);
		e.setRmp(10000);
		e.setPower(120);
		e.setManufacturer("tata");
		e.cardet();
		
	}
	void cardet() {
		System.out.println("Car rmp "+rmp);
		System.out.println("Car Power "+Power);
		System.out.println("Car manufacturer "+manufacturer);
		System.out.println("Car hasTurbo "+hasTurbo);
	}
	
	
}
class Main{
	public static void main(String[] args) {
		Car c=new Car();
		c.setModel("Tata tiago");
		c.setCompanyName("tata");
		c.setColor("black");
		c.cardetails();
		Engine e1=new Engine();
		e1.displayCar();	
	}
}