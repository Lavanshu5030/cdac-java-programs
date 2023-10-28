package practiceAssignment;

public class Circle2D extends Shape2D{
	public double radius;
	
	public Circle2D(double radius) {
		this.radius = radius;
	}
	@Override
	public double get2DArea() {
		return Math.PI * radius * radius;
	}
	
}
