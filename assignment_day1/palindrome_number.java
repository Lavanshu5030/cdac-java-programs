package assignment_day1;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12211;
		int original = num;
		int rev = 0;
		while(num != 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num = num/10;
		}
		if (original == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrom");
		}

	}

}
