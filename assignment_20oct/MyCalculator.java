package assignment_20oct;

public class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum = 1;
		for (int i = 2; i<=n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
			
		}
		return sum;
	}
}
