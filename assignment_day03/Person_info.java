package assignment_day03;

public class Person_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(2000,03,01);
		Employee e1 = new Employee(1, "Pune Kothrud");
		Account a1 = new Account(1000.90);
		Person p1 = new Person("Lavanshu", d1, a1, e1);
		p1.display();

	}

}
