package assignment_day03;

public class Person {
	String name;
	Date d1;
	Account a1;
	Employee e1;
	
	// Parameterized Constructor
	Person(String name, Date d1, Account a1, Employee e1){
		this.name = name;
		this.d1 = d1;
		this.a1 = a1;
		this.e1 = e1;
	}
	
	// Printing Name, DOB, Account balance, id and address
	
	void display() {
		System.out.println("Name:" + name);
		System.out.println("Date of birth:" + d1.yy + "/" + d1.mm + "/" + d1.dd);
		System.out.println("Account balance:" + a1.balance);
		System.out.println("Employee Id:" + e1.id);
		System.out.println("Employee Adress:" + e1.address);

	}



}
