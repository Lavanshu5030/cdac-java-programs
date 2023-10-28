package practiceAssignment;

import java.text.DecimalFormat;

public abstract class Shape2D {
	public abstract double get2DArea();
	public void displayArea() {
		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		double area = get2DArea();
		System.out.println("Area:" + decimalFormat.format(area));
		
		
		}
}
