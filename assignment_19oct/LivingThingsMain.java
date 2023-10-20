package assignment_19oct;

public class LivingThingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generally method gets call of which type the object is... but in overriding we can upcast
		// the child class into parent class and that child class method gets called
		LivingThings a = new HumanBeings();
		a.method();
		
		LivingThings b = new Animals();
		b.method();
		
		LivingThings c = new Plants();
		c.method();
		
		LivingThings d = new Bacteria();
		d.method();

	}

}
