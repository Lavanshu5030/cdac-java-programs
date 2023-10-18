package Inheritance;

public class Bus extends Vehicle{
	void bus_method() {
		System.out.println("You are inside Bus class method...bus_method()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus();
		b.vehicle_method();
		b.bus_method();

	}

}
