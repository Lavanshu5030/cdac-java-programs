package assignment_day1;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// Taking size input
		int size = s.nextInt();
		// Declaring array
		int arr[] = new int[size];
		// Taking array input
		for (int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		int j = size-1;
		for (int i = 0; i<j; i++) {
			// Swapping
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		// Print array after sorting
		for (int i = 0; i<size; i++) {
			System.out.print(arr[i]);
		}		
	}
}
