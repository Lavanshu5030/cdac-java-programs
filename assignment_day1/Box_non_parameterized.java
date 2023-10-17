package assignment_day1;

public class Box_non_parameterized {
	int a;
	double r; 
	int l;
	int b;
	
	Box_non_parameterized(){
		this.a = 2;
		this.r = 1.0;
		this.l = 3;
		this.b = 1;
	}
	void area_of_circle() {
		System.out.println("area of circle:" + 3.14 * r * r);
	}
	void area_of_cube() {
		System.out.println("area of cube:" + 6 * a * a);
	}
	void area_of_rectangle() {
		System.out.println("area of rectangle:" + l * b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box_non_parameterized b1 = new Box_non_parameterized();
		b1.area_of_circle();
		b1.area_of_cube();
		b1.area_of_rectangle();
		

	}

}
