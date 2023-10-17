package assignment_day1;

import java.util.Scanner;

public class Divisors_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (int i = 2; i<num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
