package assignment_day1;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		int num = 21;
		for (int i = 2; i<num; i++) {
			if (num % i == 0) {
				flag = 1;
				System.out.println("Not Prime \n");
				break;
			}
		}
		if (flag == 0) {
		System.out.println("Prime \n");
		}

	}

}
