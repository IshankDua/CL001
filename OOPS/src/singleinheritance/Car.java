package singleinheritance;

public class Car extends Vehicle {
	
	String name;
	String transmission;
	int noOfGears;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String company, String color, String name, String transmission, int noOfGears) {
		super(company, color);
		this.name = name;
		this.transmission = transmission;
		this.noOfGears = noOfGears;
	}



	public void display() {
		super.display();
		System.out.println("Car Display called!");
	}

}
