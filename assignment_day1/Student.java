//1. Create A Student Class with fields id,age and name and print default values without initializing.

package assignment_day1;

public class Student {
	int id;
	int age;
	String name;
	
	void display() {
		System.out.println(id + " " + age + " " + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.display();

	}

}
