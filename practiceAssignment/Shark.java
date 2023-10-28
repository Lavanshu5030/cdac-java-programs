package practiceAssignment;

public class Shark extends Fish{
	double lenght;
	
	public Shark(String name, double lenght) {
		super(name);
		this.lenght = lenght;
	}
	
	public void greeting() {
		System.out.println("I can bite you");
	}
	
	public void bite() {
		System.out.println("Bite!!");
	}
}
