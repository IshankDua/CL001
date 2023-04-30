package singleinheritance;

public class Vehicle {
	
	String company;
	String color;
	
	
	
	public Vehicle(String company, String color) {
		super();
		this.company = company;
		this.color = color;
	}



	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void display() {
		
		System.out.println("Vehicle Display called!");
	}

}
