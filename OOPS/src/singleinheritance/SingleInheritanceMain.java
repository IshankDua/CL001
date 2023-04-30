package singleinheritance;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.company = "Maruti";
		car.name = "Baleno";
		
		//sysout
		Car car1 = new Car();
		//Car car2 = new Vehicle();
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		
		
		car1.display();
		v1.display();
		v2.display();
		
		
	}

}
