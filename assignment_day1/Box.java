//2. Create A Class Box write method to calculate area of circle,area of cube,area of rectangle(Note use parameterized methods)

package assignment_day1;

public class Box {
	int a;
	double r;
	int l;
	int b;
	
	//Parameterized Constructor
	Box(int a, double r, int l, int b){
		this.a = a;
		this.r = r;
		this.l = l;
		this.b = b;
	}
	void area_of_circle(){
		System.out.println("Area of Circle: " + 3.14 * r *r);
	}
	void area_of_cube() {
		System.out.println("Area of Cube: " + 6 * a * a);
	}
	void area_of_rectangle() {
		System.out.println("Area of rectangle: " + l * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(2, 1.0, 2, 4);
		b1.area_of_circle();
		b1.area_of_cube();
		b1.area_of_rectangle();

	}

}
