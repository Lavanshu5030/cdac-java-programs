package Inheritance;

public class Car extends Vehicle{
	void car_method() {
		System.out.println("You are inside Car class method...car_method()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.vehicle_method();
		c.car_method();

	}

}
