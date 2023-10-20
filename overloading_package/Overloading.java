package overloading_package;

public class Overloading {
	int x;
	int y;
	int z;

	int add(int x, int y){
		this.x = x;
		this.y = y;
		return x + y;
	}
	
	int add(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return x + y + z;
	}
	
	double add(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		int i = o.add(1, 2);
		int j = o.add(1, 2, 3);
		double k = o.add(1.0, 2.0);
		System.out.println(i +" " + j + " " + k);
		

	}

}
