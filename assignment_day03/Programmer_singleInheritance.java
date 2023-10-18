package assignment_day03;
// Used extends keyword to inherit the properties of parent class
public class Programmer_singleInheritance extends Employee_Inheritance {
	int bonus;
	
	//Constructor
	Programmer_singleInheritance(){
		bonus = 1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer_singleInheritance p = new Programmer_singleInheritance();
		System.out.println("Bonus:" + p.bonus);
		System.out.println("Salary:" + p.salary);

	}

}
