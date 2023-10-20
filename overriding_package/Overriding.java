package overriding_package;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal a = new Animal();
		//a.makeSound();
		//Dog d = new Dog();
		//d.makeSound();
		//Cat c = new Cat();
		//c.makeSound();
		
		Animal a = new Dog();
		a.makeSound();
		Animal b = new Cat();
		b.makeSound();
		

	}

}
