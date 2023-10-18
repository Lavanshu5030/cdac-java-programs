package assignment_day03;

public class Date {
	int yy;
	int mm;
	int dd;
	
	// Parameterized Constructor
	Date(int yy, int mm, int dd){
		this.yy = yy;
		this.mm = mm;
		this.dd = dd;
	}
	
	// Printing date
	void display() {
		System.out.println("Date of birth:" + yy + "/" + mm + "/" + dd );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(2001,03,01);
		d1.display();

	}

}
