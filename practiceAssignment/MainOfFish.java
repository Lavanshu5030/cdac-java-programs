package practiceAssignment;

public class MainOfFish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f1 = new Fish("Generic Fish");
		Fish f2 = new Shark("Magladon", 6.3);
		
		f1.greeting();
		
		f2.greeting();
		//bite() method is not Overridden...so
		// we have to create shark type reference
		Shark s1 = new Shark("shark2", 5.9);
		s1.bite();
		

	}

}
