package Inheritance;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(20,30);
		f1.print();
		
		f1.setNumerator(12);

		int d = f1.getDenominator();
		//System.out.println(d);
		f1.print();
		//4
		
		

	}

}
