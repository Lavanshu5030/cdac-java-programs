package assignment_day1;

public class Number_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int j;
		for (int i = 1; i <= n; i++) {
			for (j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (j= 1; j <= i; j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		

	}

}
