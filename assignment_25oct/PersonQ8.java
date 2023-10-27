package assignment_25oct;

public class PersonQ8 {
	String name;
	int age;
	String address;
	String phoneN;
	
	//Constructor
	public PersonQ8(String name, int age, String address, String phoneN) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneN = phoneN; 
	}
	
	@Override
	public String toString() {
		return name + " " + age + " " + address + " " + phoneN;
	}

}
