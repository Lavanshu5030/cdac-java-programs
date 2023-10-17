package assignment_day1;

public class Calculate_SI {
	int principal;
	double interest;
	int year;
	double total;
	
	Calculate_SI(int principal, double interest, int year){
		this.principal = principal;
		this.interest = interest;
		this.year = year;
	}
	
	void display_result() {
		total = principal + (principal * interest * year)/100 ;
		System.out.println("SI is :" + total) ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate_SI s1 = new Calculate_SI(1000, 7.2, 3);
		s1.display_result();
		

	}

}
