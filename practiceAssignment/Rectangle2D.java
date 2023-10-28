package practiceAssignment;

public class Rectangle2D extends Shape2D {
	public double length;
	public double width;
	
	public Rectangle2D(double lenght, double width) {
		this.length = lenght;
		this.width = width;
	}
	@Override
	public double get2DArea() {
		return length * width;
	}
	
}
